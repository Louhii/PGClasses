package PACKAGE_NAME;

import java.util.Arrays;

class IT391_Banks_Unit4_PartB {

        public static void main(String[] args) {

                System.out.println("********** Section 1- Bubble Sort ***********");
                System.out.println();

                int[] studentGrades = {65, 95, 75, 55, 56, 90, 98, 88, 97, 78};

                for (int i = 0; i < studentGrades.length - 1; i++) {
                        for (int j = 0; j < studentGrades.length - i - 1; j++) {
                                if (studentGrades[j] < studentGrades[j + 1]) {
                                        int temp = studentGrades[j];
                                        studentGrades[j] = studentGrades[j + 1];
                                        studentGrades[j + 1] = temp;
                                }
                        }
                }

                for (int i = 0; i < studentGrades.length - 1; i++) {
                        for (int j = 0; j < studentGrades.length - i - 1; j++) {
                                if (studentGrades[j] > studentGrades[j + 1]) {
                                        int temp = studentGrades[j];
                                        studentGrades[j] = studentGrades[j + 1];
                                        studentGrades[j + 1] = temp;
                                }
                        }
                }

                System.out.print("The unsorted list of grades is: ");
                printArray(studentGrades);
                System.out.println();

                System.out.print("The grades in descending order are: ");
                printArray(studentGrades);
                System.out.println();

                System.out.print("The grades in ascending order are: ");
                printArray(studentGrades);
                System.out.println();
                int[] grades = {87, 63, 45, 78, 92, 88, 72, 55, 98, 70};

                // Print section header
                System.out.println("************ Section: 2-Quick Sort ***********");
                System.out.println();

                // Print unsorted array
                System.out.print("The unsorted list of grades is: ");
                printArray(grades);
                System.out.println();

                // Sort array in descending order
                sortArrayDescQS(grades, 0, grades.length - 1);
                System.out.print("The grades in descending order are: ");
                printArray(grades);
                System.out.println();

                // Sort array in ascending order
                sortArrayAscQS(grades, 0, grades.length - 1);
                System.out.print("The grades in ascending order are: ");
                printArray(grades);
                System.out.println();
        }

        public static void printArray(int[] arr) {
                for (int i = 0; i < arr.length; i++) {
                        System.out.print(arr[i] + " ");
                }
        }

        public static void sortArrayDescQS(int[] arr, int left, int right) {
                int i = left;
                int j = right;
                int pivot = arr[(left + right) / 2];

                while (i <= j) {
                        while (arr[i] > pivot) {
                                i++;
                        }
                        while (arr[j] < pivot) {
                                j--;
                        }
                        if (i <= j) {
                                int temp = arr[i];
                                arr[i] = arr[j];
                                arr[j] = temp;
                                i++;
                                j--;
                        }
                }

                if (left < j) {
                        sortArrayDescQS(arr, left, j);
                }
                if (i < right) {
                        sortArrayDescQS(arr, i, right);
                }
        }

        public static void sortArrayAscQS(int[] arr, int left, int right) {
                int i = left;
                int j = right;
                int pivot = arr[(left + right) / 2];

                while (i <= j) {
                        while (arr[i] < pivot) {
                                i++;
                        }
                        while (arr[j] > pivot) {
                                j--;
                        }
                        if (i <= j) {
                                int temp = arr[i];
                                arr[i] = arr[j];
                                arr[j] = temp;
                                i++;
                                j--;
                        }
                }

                if (left < j) {
                        sortArrayAscQS(arr, left, j);
                }
                if (i < right) {
                        sortArrayAscQS(arr, i, right);
                }
        }
        public static String main2(String[] args) {
                int[] grades = {80, 90, 70, 85, 60, 95, 75};
                int[] sortedGrades = grades.clone();
                Arrays.sort(sortedGrades);

                System.out.println();
                System.out.println("*********** Section: 3-Sequential Search ***********");
                System.out.println();

                System.out.println("The contents of the grade array are, " + Arrays.toString(sortedGrades));
                System.out.println();

                System.out.println(seqSearch(sortedGrades, 75));
                System.out.println();

                System.out.println(seqSearch(sortedGrades, 60));
                System.out.println();


                {

                }
                int[] grades2 = {85, 90, 93, 95, 97, 98};
                int searchValue = 56;

                System.out.println();

                System.out.println("**** Sector: 4-Binary Search ******");

                System.out.println();

                System.out.println("The contents of the grade array are: " + Arrays.toString(grades));
                System.out.println();
                System.out.println(binarySearch(grades, searchValue));

                searchValue = 50;
                System.out.println();
                System.out.println(binarySearch(grades2, searchValue));

                // Print a blank line
                System.out.println();
                return null;
        }

        private static boolean seqSearch(int[] sortedGrades, int i) {
                return false;
        }

        // Binary search method
        public static String binarySearch(int[] arr, int value) {
                int low = 0;
                int high = arr.length - 1;
                while (low <= high) {
                        int mid = (low + high) / 2;
                        if (arr[mid] == value) {
                                return "Value " + value + " found at index " + mid + ".";
                        } else if (arr[mid] < value) {
                                low = mid + 1;
                        } else {
                                high = mid - 1;
                        }
                }
                return "Value " + value + " was not found in the array.";
        }
}






