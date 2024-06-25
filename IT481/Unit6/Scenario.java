import java.util.Scanner;

public class Scenario {

    static int items;
    static int controlItemNumber;
    static int numberOfItems;
    static int totalRooms;
    static int numberOfCustomers;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("What ClothingItems value do you want? (0 = random amount)");
        controlItemNumber = in.nextInt();

        System.out.println("How many customers are there?");
        numberOfCustomers = in.nextInt();

        System.out.println("How many dressing rooms do you want?");
        totalRooms = in.nextInt();

        in.close();

        DressingRoom dr = new DressingRoom(totalRooms);
        for (int i = 0; i < numberOfCustomers; i++) {
            Customer cust = new Customer(controlItemNumber);
            numberOfItems = cust.getNumberOfItems();
            items += numberOfItems;
            dr.RequestRoom(numberOfItems);
        }
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        int averageItemsPerCustomer = items / numberOfCustomers;
        System.out.println("Average number of items per person is: " + averageItemsPerCustomer);

        System.out.println("Average time in a room in seconds is " + dr.getRunTime() / numberOfCustomers / 1000000);
        System.out.println("Average Wait time in seconds is " + dr.getWaitTime() / numberOfCustomers / 1000000);
        System.out.println("Total customer count is: " + numberOfCustomers);

    }
}