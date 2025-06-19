package week5;

public class Wap1 {
	
public static void main(String[] args) {
		
		String S="aaabbbccc";
		int a=0,b=0,c=0;
		
		for (int i = 0; i < S.length(); i++) {
			char ch=S.charAt(i);
			if(ch=='a') {
				System.out.println(ch);
				a++;
			}else if(ch=='b') {
				System.out.println(ch);
				b++;
			}else if (ch=='c') {
			System.out.println(ch);	
			}c++;
			   }
             
	System.out.println("a ->"+a);
	System.out.println("b ->"+b);
	System.out.println("c ->"+c);
	

}
}