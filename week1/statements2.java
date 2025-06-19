// File: StudentCheck.java
package week1;  // pae

public class statements2 {  // class name

    public static void main(String[] args) {
        int age = 19;
        int marks = 88;

        if (age >= 18) {
            System.out.println("You are an adult.");

            if (marks >= 85) {
                System.out.println("You are eligible for scholarship.");
            } else {
                System.out.println("You are not eligible for scholarship.");
            }

        } else {
            System.out.println("You are not an adult.");
        }
    }
}
