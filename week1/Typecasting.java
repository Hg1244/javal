package week1;

import java.util.Arrays;

public class Typecasting {
	static double x = 10.5;
	int y = (int) x; 
	
	static byte a='k';
	 int m=a;
	
	double k='a';
	int h=(int)k;
	
	float f='h';
	double j=f;
	
	char l='h';
	int o=(int)l;
	
	static int[] arr1=new int [7];

	public static void main(String[] args) {
		arr1[0]=23;
		arr1[1]=23;
		arr1[2]=23;
		arr1[3]=23;
		arr1[4]=23;
		arr1[5]=23;
		arr1[6]=23;
		
				
		System.out.println(Arrays.toString(arr1));
		
		
				

	}

}
