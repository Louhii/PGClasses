import java.lang.reflect.Array;
import java.util.ArrayList;

public class IT232_Banks_Unit3 {
    public static void main(String[] args) {
        String[][] salesRegions = {{"North", "South", "East", "West"},
                {"Bob", "Sue", "Nathan", "Wanda"},
                {"Stef", "Janice", "Henry", "Charles"},
                {"Ron", "Will", "Kimmy", "Pete"}

        };

        System.out.print("Section 1:Two-dimensional Array" + '\n');
        for (int i = 0; i < salesRegions.length; i++) {
            for (int j = 0; j < salesRegions[i].length; j++) {
                System.out.println(salesRegions[j][i]);
            }
        }
        System.out.print('\n' + "Section 2: Array List" + '\n');
        ArrayList<String> salesTeam = new ArrayList<String>();
        salesTeam.add("Bob");
        salesTeam.add("Stef");
        salesTeam.add("Ron");

        System.out.println("There are " + salesTeam.size() + " names in the salesTeam arraylist");
        salesTeam.add("Sue");
        salesTeam.add("Janice");
        salesTeam.add("Will");

        boolean test = salesTeam.contains("Stef");
        if (test) {
            System.out.println("Stef is in the salesTeam arraylist");
        }

        System.out.println("There are " + salesTeam.size() + " names in the salesTeam arraylist");
        salesTeam.remove("Janice");
        salesTeam.remove("Ron");
        System.out.println("There are " + salesTeam.size() + " names in the salesTeam arraylist");
        System.out.println("Names currently in the salesTeam arraylist");
        for (int i = 0; i < salesTeam.size(); i++) {
            System.out.println(salesTeam.get(i));
        }

    }
}







