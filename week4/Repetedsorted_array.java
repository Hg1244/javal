package week4;

import java.util.Arrays;

public class Repetedsorted_array {

	

	public static void main(String[] args) {
		int [] a= {3,2,4,7,4,6,5,1,5,6};
		for (int i = 0; i < a.length; i++) {
			int c=0;
		for (int j = 0; j < a.length; j++) {
				if(a[i]==a[j] &&i!=j) {
					c++;
				
			
		}		
		}
			if(c==0) {
				System.out.println(a[i]);
				break;

			}		}
	}	
	}

