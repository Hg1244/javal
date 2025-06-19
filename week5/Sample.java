package week5 ;
public class Sample {
    
    static String s1 = "hi";

    public static void substringCheck(int start, int end) {
        try {
            // 1. If the string is only 2 characters, show error
            if (s1.length() <= 2) {
                throw new Exception("Only 2 characters in the string.");
            }

            // 2. If start or end is out of range
            if (start < 0 || end > s1.length()) {
                throw new Exception("Start or end index is out of range.");
            }

            // 3. If start is greater than or equal to end
            if (start >= end) {
                throw new Exception("Start must be less than end.");
            }

            // 4. Otherwise, valid case
            String result = s1.substring(start, end);
            System.out.println("Substring: " + result);
            System.out.println("Characters: " + result.length());

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        substringCheck(0, 1);
        // You can test with (4,5), (5,2), etc.
        
       substringCheck(4,5);
       substringCheck(5,2);
       
    }
}
