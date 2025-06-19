package week1;

public class Methodoverloading {
	
	static int multiply(int a,int b) {
		return a*b;
	}
	
	static float multiply(float a, float b) {
		return a*b;
	}
	
	static double multiply(double a, double b, double c) {
		return a*b*c;
	}

	public static void main(String[] args) {
		
		System.out.println(multiply(4, 9));
		System.out.println(multiply(8, 9));
		System.out.println(multiply(5.6, 7.8, 6.0));

	}

}
