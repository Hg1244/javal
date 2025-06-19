package week2;
import week3 .Access_Modifiers;
public class Patternprinting {
	
    public static void main(String[] args) {
        int rows = 5;

        for (int i = 0; i < rows; i++) {
            // Print spaces (increase every row)
            for (int s = 0; s < i; s++) {
                System.out.print(" ");
            }

            // Print stars (decrease every row)
            for (int j = 0; j < rows - i; j++) {
                System.out.print("*");
            }

            // Move to the next line
            System.out.println();
            
            Access_Modifiers a= new Access_Modifiers();
            a.setdata(22);
            
            System.out.println(a.getdata());
        
        }
    }

	private static char[] getdata() {
		// TODO Auto-generated method stub
		return null;
	}
}
