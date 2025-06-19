package week4;

public class Floatthrow {

    public static void main(String[] args) {
        double a = 2.2;  // ← FIXED (added semicolon)
        
        try {
            if (a < 5.5) {
                throw new Exception("a cannot be greater");
            } else {
                System.out.println("a is: " + a);
            }
        } catch (Exception e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}
