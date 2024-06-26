import java.lang.reflect.Array;
import java.util.*;

public class IT232_Banks_Unit4 {
    public static void main(String[] args){
// Assignment 4 Section 1
      String [][] carDealz = {{"Ford", "Mustang", "2010"},
                             {"Chevrolet", "Silverado", "2008"},
                             {"Dodge", "Charger", "2012"}

      };
      System.out.println("Section 1: Array of Structures" + '\n');
        for (String[] strings : carDealz) {
            System.out.println(Arrays.toString(strings));


        }
// Assignment 4 Section 2
        Dictionary<String, String> inventoryCount = new Hashtable<>();
        inventoryCount.put("Mustang","9" );
        inventoryCount.put("Silverado","13");
        inventoryCount.put("Charger","4");
        System.out.println('\n' + "Section 2: Inventory Count");
                System.out.println("There are " + inventoryCount.get("Mustang") + " Mustangs.");
                System.out.println("There are " + inventoryCount.get("Silverado") + " Silverados.");
                System.out.println("There are " + inventoryCount.get("Charger") + " Chargers." +'\n');

// Assignment 4 Section 3
        System.out.println("Section 3: Days of the Week");
        ArrayList<String> DaysofWeek = new ArrayList<>();
        DaysofWeek.add("Sunday");
        DaysofWeek.add("Monday");
        DaysofWeek.add("Tuesday");
        DaysofWeek.add("Wednesday");
        DaysofWeek.add("Thursday");
        DaysofWeek.add("Friday");
        DaysofWeek.add("Saturday");
        for (int i = 0; i < DaysofWeek.size(); i++){
            System.out.println(DaysofWeek.get(i));
        }
        for (int r = DaysofWeek.size() - 1; r >= 0; r--) {
            System.out.println(DaysofWeek.get(r));
        }
        ArrayList <String>WorkDays = new ArrayList<>();
        WorkDays.add("Sunday");
        WorkDays.add("Monday");
        WorkDays.add("Tuesday");
        WorkDays.add("Wednesday");
        WorkDays.add("Thursday");
        WorkDays.add("Friday");
        WorkDays.add("Saturday");
        WorkDays.remove("Sunday");
        WorkDays.remove("Saturday");
        System.out.println(WorkDays);

//Assignment 4 Section 4
      System.out.println("Section 4: Stack");
      Stack stack1 = new Stack();
      stack1.push(10);
      stack1.push(24);
      stack1.push(31);
      stack1.push(45);
      stack1.push(19);
      stack1.push(76);

      System.out.println("There are " + stack1.size() + " in the stack");
      stack1.pop();
      stack1.pop();
      stack1.pop();
      System.out.println("There are " + stack1.size() + " in the stack");
      System.out.println("The next item to be popped from the stack is " + stack1.peek());
//Assignment 4 Section 5
      System.out.println('\n' + "Section 5: Queue");
      Queue q1 = new LinkedList();
      q1.add(10);
      q1.add(24);
      q1.add(31);
      q1.add(45);
      q1.add(19);
      q1.add(76);
      System.out.println("There are " + q1.size() + " items in the queue");
      q1.remove();
      q1.remove();
      q1.remove();
      System.out.println("There are " + q1.size() + " items in the queue");
      System.out.println("The next item to be dequeued from the queue is " +q1.peek());



    }




}
