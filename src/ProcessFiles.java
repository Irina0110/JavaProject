/**
 * Step 21:
 */

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.io.FileWriter;

// create a new class named ProcessFiles that will create a directory
// and file structure by combining the path and file name.
public class ProcessFiles {

    // The class will have three fields:
    private Path p;
    private Path p2;
    private Path p3;
    // The directory and file should be created when the object is created.

    public ProcessFiles() {
        p = Paths.get("/Users/irina/Desktop");
        p2 = Paths.get("TestResults.txt");
        p3 = p.resolve(p2);

        CreateDirectory();
    }

    // The following new methods have to be defined:
    // private void CreateDirectory()
    // public void WriteFile(EmployeeInfo emp) throws IOException
    // public void WriteFile(ArrayList<Product> products) throws IOException


    private void CreateDirectory() {
        try {
            Files.createDirectories(p);
        } catch (Exception ex) {
            System.out.println("Unable to create directory");
        }

    }

    public void WriteFile(String emp) throws IOException {
        FileWriter writer = new FileWriter(p3.toString(), true);
        PrintWriter printWriter = new PrintWriter(writer);

        printWriter.print("test " + "\n");
        printWriter.close();
    }

    public void WriteFile(ArrayList products) throws IOException {
    }


}