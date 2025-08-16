
public class NESTEDLOOP{
    public static void main(String[] args) {
    	
    
    	
        int rows = 5;
        int spaces = rows * 2 - 1 - 1;  // or: spaces = rows - 1;
        int stars = 1;

        for (int i = 1; i <= rows; i++) {
            // Print spaces
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }

            // Print stars
            for (int k = 1; k <= stars; k++) {
                System.out.print("*");
            }

            // Move to next line
            System.out.println();

            // Prepare for next row
            spaces -= 1;
            stars += 2;
        }
    }
}


