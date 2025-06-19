package week4;
import java.util.*;

public class EOP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       
        while (true) {
            try {
                System.out.println("Enter any number:");
                int n = sc.nextInt();
                System.out.println(n);
                break;
            } catch (InputMismatchException e) {
                System.out.println("ERROR: This is not a valid integer");
                sc.next();  // Clear wrong input
            }
        }

       
        while (true) {
            try {
                System.out.println("Enter any name:");
                String s = sc.next();

               
                if (!s.matches("[a-zA-Z]+")) {
                    System.out.println("ERROR: This is not a valid name (only letters allowed)");
                    continue;
                }

                System.out.println(s);
                break;

            } catch (InputMismatchException e) {
                System.out.println("ERROR: This is not a valid string");
                sc.next(); // Clear input
                e.printStackTrace();
            } finally {
                System.out.println("process end");
            }
        }

        sc.close();
    }
}
