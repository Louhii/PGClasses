import java.util.Arrays;
import java.util.Set;
import java.util.HashSet;

public class IT481_EvanBanks_Unit7 {
    enum SortingAlgorithm {
        BUBBLESORT, QUICKSORT
    }

    private static boolean debug = false;

    public static void main(String[] args) {
        System.out.println("Benchmark");

        int smallArray[] = getArray(10, 20);
        int mediumArray[] = getArray(1000, 2000);
        int largeArray[] = getArray(10000, 20000);

        int[] uniqueSmallArray = SetUniqueElements(smallArray.clone());
        int[] uniqueMediumArray = SetUniqueElements(mediumArray.clone());
        int[] uniqueLargeArray = SetUniqueElements(largeArray.clone());

        String arrDesc = "small";
        runSortArray(smallArray.clone(), arrDesc, SortingAlgorithm.BUBBLESORT);

        arrDesc = "small unique";
        runSortArray(uniqueSmallArray.clone(), arrDesc, SortingAlgorithm.BUBBLESORT);

        arrDesc = "medium";
        runSortArray(mediumArray.clone(), arrDesc, SortingAlgorithm.BUBBLESORT);

        arrDesc = "medium unique";
        runSortArray(uniqueMediumArray.clone(), arrDesc, SortingAlgorithm.BUBBLESORT);

        arrDesc = "large";
        runSortArray(largeArray.clone(), arrDesc, SortingAlgorithm.BUBBLESORT);

        arrDesc = "large unique";
        runSortArray(uniqueLargeArray.clone(), arrDesc, SortingAlgorithm.BUBBLESORT);

        arrDesc = "small";
        runSortArray(smallArray.clone(), arrDesc, SortingAlgorithm.QUICKSORT);

        arrDesc = "small unique";
        runSortArray(uniqueSmallArray.clone(), arrDesc, SortingAlgorithm.QUICKSORT);

        arrDesc = "medium";
        runSortArray(mediumArray.clone(), arrDesc, SortingAlgorithm.QUICKSORT);

        arrDesc = "medium unique";
        runSortArray(uniqueMediumArray.clone(), arrDesc, SortingAlgorithm.QUICKSORT);

        arrDesc = "large";
        runSortArray(largeArray.clone(), arrDesc, SortingAlgorithm.QUICKSORT);

        arrDesc = "large unique";
        runSortArray(uniqueLargeArray.clone(), arrDesc, SortingAlgorithm.QUICKSORT);
    }

    private static int[] getArray(int size, int randomMaxSize) {
        int myArray[] = new int[size];
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = getRandomNumber(randomMaxSize);
        }
        return myArray;
    }

    private static void runSortArray(int[] arr, String arrDesc, SortingAlgorithm sortType) {
        String sortDesc = null;
        if (sortType == SortingAlgorithm.BUBBLESORT) {
            sortDesc = "bubble";
        } else if (sortType == SortingAlgorithm.QUICKSORT) {
            sortDesc = "quick";
        }
        if (debug) {
            System.out.println("Array before the " + sortDesc + " sort");
            for (int i = 0; i < arr.length; i++) {
                System.out.println(arr[i] + " ");
            }
            System.out.println("\n");
        }
        long startRun = System.nanoTime();
        if (sortType == SortingAlgorithm.BUBBLESORT) {
            bubbleSort(arr);
        } else if (sortType == SortingAlgorithm.QUICKSORT) {
            int low = 0;
            int high = arr.length - 1;
            QuickSort(arr, low, high);
        }
        long endRun = System.nanoTime();
        if (debug) {
            System.out.println("Array after the " + sortDesc + " sort");
            for (int i = 0; i < arr.length; i++) {
                System.out.println(arr[i] + " ");
            }
            System.out.println("\n");
        }
        System.out.println("The run time for sorting the " + arrDesc + " array using "
                + sortDesc + " sort in nanoseconds is" + (endRun - startRun));

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    public static int getRandomNumber(int maxValue) {
        int x = 1 + (int) (Math.random() * maxValue);
        return x;
    }

    private static void bubbleSort(int[] intArray) {
        int n = intArray.length;
        int temp = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - 1); j++) {
                if (intArray[j - 1] > intArray[j]) {
                    temp = intArray[j - 1];
                    intArray[j - 1] = intArray[j];
                    intArray[j] = temp;
                }
            }
        }
    }

    @SuppressWarnings("unused")
    private static int[] SetUniqueElements(final int[] inputArray) {
        final Set<Integer> set = new HashSet<>();

        final int[] tmp = new int[inputArray.length];
        int index = 0;

        for (final int i : inputArray)
            if (set.add(i))
                tmp[index++] = i;
        return Arrays.copyOfRange(tmp, 0, index);
    }

    public static void QuickSort(int[] arr, int low, int high) {
        int middle = low + (high - low) / 2;

        int pivot = arr[middle];

        int i = low, j = high;
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
        if (low < j)
            QuickSort(arr, low, j);
        if (high > i)
            QuickSort(arr, i, high);
    }
}