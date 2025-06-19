package week2;

public class STATEMENTS {

    public static void main(String[] args) {
        int[] a = {2, 3, 4, 6, 7, 8};
        for (int k : a) {
            if (k == 3) {
                break; // or break, depending on your goal
            }
            System.out.println(k);
        }
    }
}
