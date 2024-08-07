import java.util.Scanner;
import java.util.Stack;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class IT391_Banks_Unit2
{
    public static void main(String[] args)

    {
        //*********************************************************
        //****Assignment 2, Part A, Section 1
        //*********************************************************
        System.out.printf("\n");
        System.out.printf("**********Section 1 **********\n");
        System.out.printf("\n");
        System.out.printf("Enter any word and hit enter to see the word reversed: ");

        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        System.out.printf("\nYour word in reverse is: " + revString(str) + "\n");

        //*********************************************************
        //****Assignment 2, Part A, Section 2
        //*********************************************************
        System.out.printf("\n");
        System.out.printf("**********Section 2 **********\n");
        System.out.printf("\n");

        //Create the queue object from LinkedList class for more flexibility
        Queue<String> customers = new LinkedList<String>();

        //Load the queue with names
        customers.add("Jane");
        customers.add("Bob");
        customers.add("Liza");
        customers.add("Tom");
        customers.add("Mary");

        System.out.printf("The number of shoppers at the grocery store is, " + customers.size() + "\n");
        System.out.printf("The first shopper in line is, " + customers.peek() + "\n");

        customers.add("Stephen");
        customers.add("Ellen");

        customers.remove();
        customers.remove();
        customers.remove();
        System.out.printf("The number of shoppers now in line is, " + customers.size() + "\n");
        System.out.printf("The shopper currently first in line is, " + customers.peek() + "\n");

        scanner.nextLine();


    }private static String revString(String str)
    {
        Stack<String> wordStack = new Stack<String>();


        for (int i = 0; i < str.length(); i++)
            wordStack.push(str.substring(i, i+1));
        String reversed = "";
        for (int i = 0; i < str.length(); i++)
            reversed += wordStack.pop();
        return reversed;
    }
}
