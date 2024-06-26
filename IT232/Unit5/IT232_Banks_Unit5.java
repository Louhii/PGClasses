import java.io.BufferedReader;
import java.io.FileReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class IT232_Banks_Unit5 {

    private static final String FILE_NAME = "ProducePrice.txt";

    public static void main(String[] args) {
//Assignment 5 Section 1
        List<String> produceList = new ArrayList<>();
        produceList.add("bananas 0.59");
        produceList.add("grapes 2.99");
        produceList.add("apples 1.49");
        produceList.add("pears 1.39");
        produceList.add("lettuce 0.99");
        produceList.add("onions 0.79");
        produceList.add("potatoes 0.59");
        produceList.add("peaches 1.59");

        Path out = Paths.get(FILE_NAME);
        try {
            Files.write(out, produceList);
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        int numLines = FileLineCount(FILE_NAME);
        System.out.println("There are " + numLines + " products in the file.\n");

//Assignment 5 Section 2

        produceList.add("peppers 0.99");
        produceList.add("celery 1.29");
        produceList.add("cabbage 0.79");
        produceList.add("tomatoes 1.19");

        try {
            Files.write(out, produceList);
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        numLines = FileLineCount(FILE_NAME);
        System.out.println("There are " + numLines + " products in the file.\n");

//Assignment 5 Section 3

        List<String> producePrices = new ArrayList<>();
        try {
            BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME));
            String line;
            while ((line = reader.readLine()) != null) {
                producePrices.add(line);
            }
            reader.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }


        int lineNum = 0;
        for (String item : producePrices) {
            System.out.println(++lineNum + ". " + item);
        }

        System.out.println("\nThere are " + producePrices.size() + " products in the producePrices list.");
    }


    private static int FileLineCount(String fileName) {
        int numLines = 0;
        try {
            BufferedReader reader = new BufferedReader(new FileReader(fileName));

            while (reader.readLine() != null) {
                numLines++;
            }
            reader.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return numLines;
    }

}