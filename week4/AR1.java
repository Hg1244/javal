package week4;

public class AR1 {

	public static void main(String[] args) {
		int[] numbers= {1,2,3,4,5,6,7,8,9,10};
		System.out.println("Even numbers found:");
		linearsearch(numbers,true);
		
	}
	public static void linearsearch(int[]a,boolean findeven) {
		for(int number:a) {
			if(number%2==0) {
				System.out.println(number+" ");
			}
			
			

	}
	}

}
