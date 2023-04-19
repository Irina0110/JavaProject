/**
 * Main class. Contains final step 14, 15, 16
 * Step 14: Add functionality to your classes that would
 * allow them to be sorted by name with the Collections.sort method.
 * Step 15: You are going to store
 * a collection of the devices as they come off the production line. Choose an appropriate Java
 * Collection and create a driver class that demonstrates its use. You should also demonstrate the
 * Collections.sort method.
 * Step 16: Create a method called print that would take your collection
 * and list all of the contents. It should handle all of your classes
 *
 * @author Larson 10/27/2018
 */
import java.util.Scanner;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.io.FileWriter;


public class Main {

    public static void main(String[] args) {

        ProcessFiles pf = new ProcessFiles();
        try {
            pf.WriteFile("Test");
        } catch (Exception ex){
            System.out.println("Could not write");

        }


        // Write one line of code to create an ArrayList of products
        //ArrayList<Product> studentProducts = new ArrayList<Product>();
        ArrayList<Product> products;

        // Write one line of code to call testCollection and assign the result to the ArrayList
        products = testCollection();

        // Write one line of code to sort the ArrayList
        Collections.sort(products);
        // Call the print method on the ArrayList
        System.out.println(products);
        print(products);

    }

    // Step 15
    // Complete the header for the testCollection method here

    public static ArrayList<Product> testCollection() {

        AudioPlayer a1 = new AudioPlayer("iPod Mini", "MP3");
        AudioPlayer a2 = new AudioPlayer("Walkman", "WAV ");
        MoviePlayer m1 = new MoviePlayer("DBPOWER MK101",
                new Screen(" 720x480", 40, 22), MonitorType.LCD);
        MoviePlayer m2 = new MoviePlayer("Pyle PDV156BK",
                new Screen("1366x768", 40, 22), MonitorType.LED);

        // Write one line of code here to create the collection
        ArrayList<Product> products = new ArrayList<>();

        products.add(a1);
        products.add(a2);
        products.add(m1);
        products.add(m2);
        return products;
    }

    // Step 16
    // Create print method here

    public static <T> void print(List<T> products) {

        for (T t : products) {
            System.out.println(t.toString());
        }
    }


}