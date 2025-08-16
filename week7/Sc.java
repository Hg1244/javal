package week7;
import java.util.Scanner;
public class Sc {

	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a:");
		int a=sc.nextInt();
		
		System.out.println("Enter b:");
		int b=sc.nextInt();
		System.out.println("Enter operator(+,*,-,/):");
		String s=sc.next();
		int result=0;
		switch(s) {
		case "+":
			result=a+b;		
		break;
		case "*":
			result=a*b;
		break;
		case "-":
		   result=a-b;
		break;
		case "/":
			if(b!=0) {
				result=a/b;
			}else {
				System.out.println("Error:Division by zero not allowed");
			}
			
			break;	
default:
	System.out.println("Invalid Operator");
}
		System.out.println("Result: " + result);

        sc.close();
	}
}
