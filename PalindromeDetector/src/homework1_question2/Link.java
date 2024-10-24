package homework1_question2;

public class Link {

    public char data;
    public Link next;

    public Link(char nodeData) { // Constructor
        this.data = nodeData;
    }

    public void displayLink() // Display this link
    {
        System.out.print(data + " --> ");
    }
}
