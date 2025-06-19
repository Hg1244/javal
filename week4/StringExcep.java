package week4;
public class StringExcep {
   public static void main(String[] args) {
		try {
			String s="hello";
			System.out.println(s.charAt(10));
		}catch(StringIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
	}
}
