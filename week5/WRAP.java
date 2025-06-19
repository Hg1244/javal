package week5;
public class WRAP {
static Integer k=16;
	
	public static void main(String[] args) {
		
		System.out.println(k.compareTo(k));
		System.out.println(k.doubleValue());
			System.out.println(k.intValue());
			System.out.println(Integer.SIZE);
			System.out.println(Float.SIZE);
			System.out.println(Integer.compareUnsigned(-89, -16));
			System.out.println(Integer.compare(2, 0));
			
		Character c='B';
		Character c1='i';
		Character c2='7';
		Character c3=' ';
			System.out.println(Character.isUpperCase(c));
	System.out.println(Character.isLetter(c1));	
	System.out.println(Character.isWhitespace(c3));
			System.out.println(Character.isDigit(c2));
			
			
		String s="77*dhyF*    ";
		int l=0,d=0,s1=0,w=0;
		for (int i = 0; i < s.length(); i++) {
			char c4=s.charAt(i);
			if(Character.isLetter(c4)) {
				System.out.println(c4);
				l++;
			}else if (Character.isDigit(c4)){
				System.out.println(c4);
				d++;
			}else if(Character.isWhitespace(c4)) {
				System.out.println(c4);
				w++;
			}else {
				System.out.println(c4);
				s1++;
				}
		}
			System.out.println("letter ->"+l);
			System.out.println("digit ->"+d);
			System.out.println("symbol->"+s1);
			System.out.println("Whitespace->"+w);
		}
}






