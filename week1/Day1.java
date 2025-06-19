  package week1;

public class Day1 {
	byte a=100;
	static short b=128;
	static char c='v';
	int d=45;
	static double f=12.67;
	boolean g=true;
	

	public static void main(String[] args) {
		int b=19;
		
		
		Day1 d=new Day1();
		Day1 d1=new Day1();
		d.b=101;
		d1.a=35;
		System.out.println(d.a);
		System.out.println(d1.b);
		System.out.println(Day1.b);
		c='b';
		System.out.println(c);
		Day1 e=new Day1();
		e.d=66;
		System.out.println(e.d);
		System.out.println(f);
		Day1 t=new Day1();
		System.out.println(t.g);
		
		
		
		

	}

}
