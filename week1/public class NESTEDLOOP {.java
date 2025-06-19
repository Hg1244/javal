public class NESTEDLOOP {
    public static void main(String[] args) {
        int rows = 9;
        int cols = rows * 2 - 1;

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= cols; j++) {
                System.out.print("*");
            }
            System.out.println();
            cols -= 2;
        }
    }
}