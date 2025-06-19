package week5;
import java.util.Arrays;
public class INTRQUES {
	static  boolean isPalindrome(String s1) {
		s1=s1.toLowerCase();
		StringBuffer sb= new StringBuffer(s1); 
		sb.reverse();
		return s1.equals(sb.toString());
		}
// 🔸 Sorting logic extracted into a method
    static void sortString(char[] c) {
        for (int i = 0; i < c.length; i++) {
            for (int j = i + 1; j < c.length; j++) {
                if (c[i] > c[j]) {
                    char temp = c[i];
                    c[i] = c[j];
                    c[j] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        String s = "Java";
        char[] c = s.toLowerCase().toCharArray();

        sortString(c);  // 🔸 Sort the characters

        // Print sorted result as a string
        System.out.println(c); // Output: aajv
        System.out.println(isPalindrome("madam"));

        // If you want to print like array: [a, a, j, v]
        // System.out.println(Arrays.toString(c));
    }
}
