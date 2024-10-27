package hw2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Map;
import java.util.TreeMap;
import java.util.HashSet;

public class Test {

    public static void main(String[] args) {
        //HashSet to store the common words.
        //HashSet is used since it has a searching complexity if O(1) 
        HashSet<String> set = new HashSet();

        //Map is used to store the word and its respective frequency
        Map<String, Integer> mp = new TreeMap<>();

        //Reading the commonwords.txt file & storing words in the hashset
        try {
            File f = new File("commonwords.txt");
            Scanner sc = new Scanner(f);
            while (sc.hasNextLine()) {
                String data = sc.nextLine();
                set.add(data);
            }
            sc.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        }
        
        //Reading the txt file
        try {
            File f = new File("totc.txt");
            Scanner sc = new Scanner(f);
            while (sc.hasNextLine()) {
                String data = sc.nextLine();
                //replaceAll is used to remove all punctuations from the string.
                //split is used to break the string into words
                
                data = data.toLowerCase();
                String[] arrOfStr = data.split("[^a-zA-Z']");
                //Frequency of every word is sorted in the map
                for (String a : arrOfStr) {
                    if (!set.contains(a.toLowerCase())) {
                        if (mp.containsKey(a)) {
                            mp.put(a, mp.get(a) + 1);
                        } else {
                            mp.put(a, 1);
                        }
                    }
                }
            }
            sc.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        }
        
        //Printing the word and its respective frequency
        for (Map.Entry<String, Integer> entry : mp.entrySet()) {
            if (!set.contains(mp)) {
                System.out.println(entry.getKey() + " - " + entry.getValue());
            }
        }
        
        
        /*
        //Reading the text.txt file
        try {
            File f = new File("tomsawyer.txt");
            Scanner sc = new Scanner(f);
            while (sc.hasNextLine()) {
                String data = sc.nextLine();
                //replaceAll is used to remove all punctuations from the string.
                //split is used to break the string into words
                String[] arrOfStr = data.replaceAll("\\p{Punct}", "").split(" ");

                //Frequency of every word is sorted in the map
                for (String a : arrOfStr) {
                    if (!set.contains(a.toLowerCase())) {
                        if (mp.containsKey(a)) {
                            mp.put(a, mp.get(a) + 1);
                        } else {
                            mp.put(a, 1);
                        }
                    }
                }
            }
            sc.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        }
         */
        
        /*
        //Reading the text.txt file
        try {
            File f = new File("dyssy10.txt");
            Scanner sc = new Scanner(f);
            while (sc.hasNextLine()) {
                String data = sc.nextLine();
                //replaceAll is used to remove all punctuations from the string.
                //split is used to break the string into words
                String[] arrOfStr = data.replaceAll("\\p{Punct}", "").split(" ");

                //Frequency of every word is sorted in the map
                for (String a : arrOfStr) {
                    if (!set.contains(a.toLowerCase())) {
                        if (mp.containsKey(a)) {
                            mp.put(a, mp.get(a) + 1);
                        } else {
                            mp.put(a, 1);
                        }
                    }
                }
            }
            sc.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        }
         */
    }
}
