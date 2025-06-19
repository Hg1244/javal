package week4;
import java.util.*;

enum Token {
    ABC,
    DEF,
    GHI
}

public class Exepprob {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            try {
                System.out.println("Enter token (ABC, DEF, or GHI):");
                String input = sc.next().toUpperCase();  // Make input case-insensitive

                // Try to convert string to enum constant
                Token t = Token.valueOf(input);

                System.out.println("Valid token: " + t);
                break;

            } catch (Exception e) {
                System.out.println("Invalid token. Try again.");
            }
        }

        sc.close();
    }
}
