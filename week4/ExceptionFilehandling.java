package week4;

import java.util.Scanner;

public class ExceptionFilehandling {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int a,b,result;
	
	System.out.println("Enter the first number:");
    a=sc.nextInt();
    
    System.out.println("Enter the second number:");
    b=sc.nextInt();
    
    try {
    	result=a/b;
    	System.out.println("result"+result);
    }
    catch(ArithmeticException e) {
    	System.out.println("Exception caught:Dividing by zero");
    }
    finally {
    	System.out.println("Finally it excuted");
    }
    sc.close();
	}
	

}
