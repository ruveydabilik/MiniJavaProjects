package homework1_question2;

public class MyStack {

    // Use necessary attributes
    private Link bottom;
    private Link top;

    public MyStack() { // constructor
        bottom = null;
        top = null;
    }

    public boolean isEmpty() {
        // Write a function which returns:
        // -> True: if the stack is Empty
        // -> False: if the stack is NOT Empty 
        if (bottom == null && top == null) {
            return true;
        }
        return false;
    }

    public void push(char ch) {
        // Write a function:
        // -> Push the string to the Stack
        Link newNode = new Link(ch);
        newNode.next = top;
        top = newNode;
    }

    public char pop() {
        // Write a function:
        // -> Pop a node from the Stack
        // -> Returns the value of that node 
        if (isEmpty()) {
            System.out.println("There isn't any item to pop.");
            return '\0';
        } else {
            char temp = top.data;
            top = top.next;
            return temp;
        }
    }

    public char peek() {
        // Write a function:
        // -> Peek the value on top of the Stack
        // -> and returns that value 
        if (isEmpty()) {
            System.out.println("The stack is empty.");
            return '\0';
        } else {
            return top.data;
        }
    }

    public void displayStack() {
        System.out.print("Bottom --> Top: ");
        if (isEmpty()) {
            System.out.println("Stack is empty.");
        } else {
            Link temp = bottom;
            while (temp != null) {
                temp.displayLink();
                temp = temp.next;
            }
            System.out.println("");
        }
    }
}
