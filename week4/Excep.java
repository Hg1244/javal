package week4;

public class Excep {
    public static void main(String[] args) {
        try {
            int[] a = {1, 2, 3, 4, 5};
            System.out.println(a[10]); // This is valid, no exception
        } catch (Exception e) {
            e.printStackTrace(); // Correct method name
        } finally {
            System.out.println("next process");
        }

        System.out.println("HELLO");
    }
}
