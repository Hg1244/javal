package week7;

import java.util.Scanner;

public class Ex {

public static  void main(String[] args) {
	
  Scanner sc=new Scanner(System.in);
  
    System.out.println("Enter  a: ");
     int a=sc.nextInt();
     
	System.out.println("Enter  b: ");
	int b=sc.nextInt();

         try {
         int number=a/b;
         System.out.println("Result:" +number);
    	  }
      catch(ArithmeticException e) {
    	  System.out.println("An exception occured ough...");
    	  e.printStackTrace();
      }
            finally {
            	System.out.println("successfully executed");
            }
    
}
       
	}


