package week4;
import java.util.Arrays;
import java.util.Scanner;
public class File_scan {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER YOUR NAME:");
		String s=sc.next();
		System.out.println("Enter your age:");
		int i1=sc.nextInt();
		System.out.println("Enter your CGPA:");
		float f=sc.nextFloat();
		
		System.out.println("ENTER THE SIZE OF ARRAY:");
		int n= sc.nextInt();
		int k[]=new int[n];
		for (int i = 0; i < k.length; i++) {
			System.out.println("ENTER THE NUMBERS");
			int n1= sc.nextInt();
			 k[i]=n1;
			 System.out.println(Arrays.toString(k));
			 
		}
		
	}

}
