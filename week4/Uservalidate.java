package week4;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Uservalidate {

    public static void main(String[] args) throws IOException {

        String choice = "Y";
        File f = new File("test.txt");
        FileWriter write = new FileWriter(f);

        Scanner sc = new Scanner(System.in); // Only create Scanner once outside the loop 
        //get input from the user manualy
        

        while (choice.equalsIgnoreCase("Y")) { //
            // Ignore case so it works with 'y' or 'Y'
            
            System.out.println("Name:");
            String name = sc.next();

            System.out.println("Password:");
            String Password = sc.next();

            // ❌ WRONG: if (Password == "123")
            // ✅ RIGHT:
            if(name.equalsIgnoreCase("nivi")) {
            	
            }
            else {
            	System.out.println("❌ Invalid Username. Name not saved.");
            }
            
             if  (Password.equals("123")) {
                // Password matched; write name to file
                write.append(name + "\n"); // Write each name on a new line
            }
            else {
            	System.out.println("❌ Invalid Password. Name not saved.");

            }

            System.out.println("Do you want to continue? (Y/N):");
            choice = sc.next();
        }

        write.close(); // Always close the writer to save changes
        sc.close();    // Also close the scanner
    }
}
