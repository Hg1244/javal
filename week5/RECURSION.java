package week5;

public class RECURSION {
	static void printnumbers(int n) {
		if(n>5) {
			return;
	}
  	System.out.println(n);
  	printnumbers(n+1);
     	
	}
	

	public static void main(String[] args) {
		printnumbers(1);
	}


	}