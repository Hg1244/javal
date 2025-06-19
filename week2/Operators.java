package week2;
import week3.Access_Modifiers;


//unary

public class Operators {
	
//post decrement
	public static void main(String[] args) {
		int a=5;
		int b=a-- ;
		System.out.println(a);
		System.out.println(b);
//pre decrement
		int a1=9;
		int b1=--a1;
		System.out.println(a1);
		System.out.println(b1);
		
//pre increment
		byte a2=10;
		byte b2=(byte) (++a2 +a2);
		System.out.println(a2);
		System.out.println(b2);
//post decrement
		byte a3=11;
		byte b3=(byte) (a3++  -a3);
		System.out.println(a3);
		System.out.println(b3);
	
	//binary

//arithmetic
	System.out.println("hi"+(8-7));
	System.out.println(9%2);
	
//comparison
	//<><=!
	System.out.println(3<5);
	System.out.println("hi"!="hi");
//logical operator
	//&& ||
	System.out.println(3>5 && 3<4);
	System.out.println(78>75 && 89<100);
	System.out.println(3<5|| 2<1);

//bitwise
	
System.out.println(6&3);

//ternery
int a4=(2!=2)?22:34;
System.out.println(a4);

int num = 4;
String result = (num % 2 != 0) ? "odd" : "even";
System.out.println(result);

Access_Modifiers a6= new Access_Modifiers();
a6.pr

	
	
	
	}

}
