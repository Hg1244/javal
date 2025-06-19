package week4;

import java.util.Arrays;

public class PROBQ {

	public static void main(String[] args) {
		int[]a= {1,2,0,3,4,0,5,0};
		int nonzero=0;
		int moveNumber=5;
		for (int i = 0; i < a.length; i++) {
			if(a[i]!=moveNumber) {
				a[nonzero]=a[i];
				
			nonzero++;
			
		}

		}
		for (int i = nonzero; i < a.length; i++) {
			a[i]=moveNumber;
			System.out.println(Arrays.toString(a));
			
		}

}
}