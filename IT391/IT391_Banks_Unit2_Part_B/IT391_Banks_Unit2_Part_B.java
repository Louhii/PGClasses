package PACKAGE_NAME;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class IT391_Banks_Unit2_Part_B {
    public static void main(String[] args){
        System.out.println('\n' + "*****Section 1*****" + '\n');
        Queue<String> bank = new LinkedList<String>();

        bank.add("Jim");
        bank.add("Bob");
        bank.add("Susan");
        bank.add("Liz");
        bank.add("Alex");

        System.out.println("The number of people in line at the banks is " + bank.size());
        System.out.println("The names of those in line at the bank are " + bank);
        System.out.println("The first customer in line is " + bank.peek());
        bank.remove();

        bank.add("Andy");
        bank.add("Rhonda");

        bank.remove();
        bank.remove();
        bank.remove();

        System.out.println("The number of customers in line now is " + bank.size());


        System.out.println("*****Section 2:*****");
        Stack<String>sentenceRev = new Stack<String>();
        System.out.println("Please enter a sentence:");
        Scanner scanner = new Scanner(System.in);
        String originalStr = scanner.nextLine();
        scanner.close();

        String words[] = originalStr.split("\\s");
        String reversedString = "";

        for (int i = 0; i <words.length; i++){
            if (i == words.length -1)
                reversedString = words[i] + reversedString;
            else reversedString = " " + words[i] + reversedString;
        }
       System.out.println(reversedString);
        }



    }

