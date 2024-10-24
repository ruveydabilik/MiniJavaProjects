package homework1_question2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Test {

    public static boolean isPalindrome(String str){
        MyStack stack = new MyStack();
        String string = "";
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i)>= 97 && str.charAt(i)<=122){ 
            // Karakterleri stack'e alıp boşluk ve noktalama işaretlerini atlıyorum
                stack.push(str.charAt(i));
                string += str.charAt(i);
            }
        }
        String result = "";
        while(!stack.isEmpty()){
            result += stack.pop();
        }
        
        if(string.equals(result)){
            return true;
        }
        else{
            return false;
        }  
    }
    public static void main(String[] args) {
        String whole_line;
        String str;
        // Reading file
        try {
            File file = new File("palindromes.txt");
            Scanner input = new Scanner(file);
            while(input.hasNextLine()) {
                whole_line = input.nextLine();
                str = whole_line.toLowerCase();
                if(isPalindrome(str)){
                    System.out.println(whole_line + " is a palindrome.");
                }
            }
            input.close();
        } catch (FileNotFoundException ex) {
            System.out.println("File Not Found !");
        }
    }
}
