package PACKAGE_NAME;// Section 1:


import java.util.*;

public class IT391_Banks_Unit3_PartB {
    public static void main(String[] args) {


        try {


            String[] mammals = {"Bear", "Gorilla", "Tiger", "Polar Bear", "Lion", "Monkey"};


            Set<String> setMammals = new HashSet<>(Arrays.asList(mammals));


            System.out.println("*********** Section: 1 ***********");


            System.out.println("Contents of the set are:");


            for (String mammal : setMammals) {
                System.out.println(mammal);
            }


            TreeSet<String> sortedMammals = new TreeSet<>(setMammals);


            System.out.println("Contents of the sorted set are:");


            for (String mammal : sortedMammals) {
                System.out.println(mammal);
            }


            System.out.println("The first item in the set is: " + sortedMammals.iterator().next());


            System.out.println("The last item in the set is: " + sortedMammals.last());

        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
        try {


            LinkedList<String> myFriends = new LinkedList<>();
            myFriends.add("Fred 602-299-3300");
            myFriends.add("Ann 602-555-4949");
            myFriends.add("Grace 520-544-9898");
            myFriends.add("Sam 602-343-8723");
            myFriends.add("Dorothy 520-689-9745");
            myFriends.add("Susan 520-981-8745");
            myFriends.add("Bill 520-456-9823");
            myFriends.add("Mary 520-788-3457");


            System.out.println();


            System.out.println("*********** Section: 2 ***********");


            System.out.println();


            System.out.println("The contents of my friends list:");


            for (String friend : myFriends) {
                System.out.println(friend);
            }

            myFriends.remove("Bill 520-456-9823");

            myFriends.removeFirst();
            myFriends.removeLast();

            int maryIndex = myFriends.indexOf("Mary 520-788-3457");
            myFriends.set(maryIndex, "Mary 520-897-4567");

            System.out.println();

            System.out.println("The updated contents of my friends list:");

            for (String friend : myFriends) {
                System.out.println(friend);
            }

            // 16. Printing the number of friends in the list
            System.out.println();
            System.out.println("The number of friends in my list is: " + myFriends.size());

            // 17. Checking if Fred is still in the list
            boolean isFredPresent = myFriends.contains("Fred 602-299-3300");
            System.out.println();
            if (isFredPresent) {
                System.out.println("Fred is still present in the list.");
            } else {
                System.out.println("Fred is no longer present in the list.");
            }

        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
        class Node {
            int key;
            Node left;
            Node right;

            public Node(int item) {
                key = item;
                left = right = null;
            }
        }

        class node {
            int key;
            node left, right;
  public node(int item){
                key = item;
                left = right = null;
            }
        }

        class BinaryTree {
            node root;

            BinaryTree() {
                root = null;
            }

            void printInOrder(node node) {
                if (node != null) {
                    printInOrder(node.left);
                    System.out.print(node.key + " ");
                    printInOrder(node.right);
                }
            }

            void printPreOrder(node node) {
                if (node != null) {
                    System.out.print(node.key + " ");
                    printPreOrder(node.left);
                    printPreOrder(node.right);
                }
            }

            void printPostOrder(node node) {
                if (node != null) {
                    printPostOrder(node.left);
                    printPostOrder(node.right);
                    System.out.print(node.key + " ");
                }
            }

            void traverse() {
                System.out.println();
                System.out.println("********** Section 3 **********");
                System.out.println();

                System.out.println("Traversing the binary tree in order:");
                printInOrder(root);
                System.out.println();

                System.out.println("Traversing the binary tree in pre-order:");
                printPreOrder(root);
                System.out.println();

                System.out.println("Traversing the binary tree in post-order:");
                printPostOrder(root);
                System.out.println();
            }

            public static void node(String[] args) {
                try {
                    BinaryTree tree = new BinaryTree();
                    tree.root = new node(1);
                    tree.root.left = new node(2);
                    tree.root.right = new node(3);
                    tree.root.left.left = new node(4);
                    tree.root.left.right = new node(5);

                    tree.traverse();
                } catch (Exception e) {
                    System.out.println("An error occurred: " + e.getMessage());
                }
            }
        }
    }
}

