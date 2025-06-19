package week4;

public class Throwabl3 {
    public static void main(String[] args) {
        int number = -5;

        try {
            if (number < 0) {
                throw new Exception  ("Number cannot be negative");
            } else {
                System.out.println("Number is: " + number);
            }
        } catch (Exception e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }

}