import java.util.ArrayList;
import java.util.Scanner;

public class Main
{


    public static void main(String[] args)
    {
        LinkedList<String> ll = new LinkedList<>();

        ll.addNode("Hello");
        ll.addNode("World");
        ll.addNode("How are you?");

        ll.insertAt(0,"bob");

        ll.printAllNodes();


    }



}