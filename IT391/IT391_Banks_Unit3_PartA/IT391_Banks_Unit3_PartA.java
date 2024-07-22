package PACKAGE_NAME;

import java.util.*;

public class IT391_Banks_Unit3_PartA {
    public static void main(String[] args) {
        //*********************************************************
        //****Assignment 3, Part A, Section 1
        //*********************************************************
        System.out.println();
        System.out.println("**********Section 1 **********");
        System.out.println();

        String[] professions = new String[] { "Software Engineer", "Programmer", "Database Admin", "Network Admin", "Web Developer", "Program Manager" };

        HashSet<String> setprofessions = new HashSet<String>();
        try {
            for (int i = 0; i <= professions.length - 1; i++) {
                setprofessions.add(professions[i]);
            }
            System.out.println("Original List: ");
            System.out.print("[");
            for (int i = 0; i <= professions.length - 1; i++) {
                System.out.print(professions[i]);
                if (i == professions.length - 1) {
                    System.out.print("]");
                } else {
                    System.out.print(", ");
                }
            }
            System.out.println();
            System.out.println();
            System.out.println("Sorted List: ");
            SortedSet<String> sortedProfessions = new TreeSet<String>(setprofessions);
            System.out.print("[");
            int j = 0;
            for (String job : sortedProfessions) {
                System.out.print(job);
                if (j != sortedProfessions.size() - 1)
                    System.out.print(", ");
                j++;
            }
            System.out.print("]");
        } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }


        //*********************************************************
        //****Assignment 3, Part A, Section 2
        //*********************************************************
        System.out.println();
        System.out.println();
        System.out.println("**********Section 2 **********");
        System.out.println();

        List<String> books = new ArrayList<String>();
        books.add("To Kill a Mockingbird");
        books.add("Huckleberry Finn");
        books.add("Pride and Prejudice");
        books.add("Brave New World");
        books.add("Lord of the Flies");
        books.add("Alice in Wonderland");
        books.add("The Old Man and the Sea");
        books.add("Atlas Shrugged");

        System.out.println("Original Book List: ");
        displayList(books);
        System.out.println();

        books.sort(null); //sort the list

        System.out.println("Sorted Book List: ");
        displayList(books);
        System.out.println();

        books.remove(1);//remove second item from list
        books.remove(0); //remove first item from list
        books.remove(books.size() - 1);//remove last item from list

        System.out.println("Book List After Deletions: ");
        displayList(books);
        System.out.println();

        System.out.println("The number of items in my book list is: " + books.size());
        System.out.println();

        int index = books.indexOf("Brave New World"); //look for this title
        if (index != -1) {
            System.out.println("Brave New World is in the list.");
        } else {
            System.out.println("Brave New World is not in the list.");
        }

        System.out.println();
        System.out.println();
        System.out.println("**********Section 3 **********");
        System.out.println();

//creates a new binary tree object which will initialize itself and print its contents
        new BinaryTree().create();

        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
        scanner.close();
    }

    public static class Node {
        public Node left;
        public Node right;
        public int value;
        public Node(int value) {
            this.value = value;
        }
    }

    public static class BinaryTree {
        public void create() {
            Node rootnode = new Node(50);
            insert(rootnode, 30);
            insert(rootnode, 45);
            insert(rootnode, 12);
            insert(rootnode, 29);
            System.out.println("The contents of the binary tree are: ");
            traverse(rootnode);
        }

        public void traverse(Node rootnode) {
            printInOrder(rootnode); // printInOrder uses recursion to traverse the tree
        }

        public void insert(Node node, int value) {
            if (value < node.value) {
                if (node.left != null) {
                    insert(node.left, value);
                } else {
                    //System.out.println(" Inserted " + value + " to left of node " + node.value);
                    node.left = new Node(value);
                }
            } else if (value > node.value) {
                if (node.right != null) {
                    insert(node.right, value);
                } else {
                    //System.out.println(" Inserted " + value + " to right of node " + node.value);
                    node.right = new Node(value);
                }
            }
        }

        public void printInOrder(Node node) {
            if (node != null) {
                printInOrder(node.left);
                System.out.println(" Traversed " + node.value);
                printInOrder(node.right);
            }
        }
    }



    public static void displayList(List<String> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}

