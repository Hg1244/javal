package week5;

public class PALINDROME {
		
	static boolean  ispalindrom(String S1) {
		for (int i = 0; i < S1.length()/2; i++) {// compares the characters from the start and end
			if(S1.charAt(i)!=S1.charAt(S1.length()-i-1)){
				//charAt(i) ->gives charater position(i) from the front
				//s1.length()-i-1 => length =5, index=4 so 5-0-1=4 (INDEX 0-M and INDEX 4-M)
					return false;
			}
		}
		return true;
		}
		

public static void main(String[] args) {
	System.out.println(ispalindrom("MADAM"));
	System.out.println(ispalindrom("mom"));
	System.out.println(ispalindrom("FATHER"));
		

	}

}
