package week4;

public class Array {
	
	static int findIndex(int[]a,int target) {
		for (int i = 0; i < a.length; i++) {
			if(a[i]==target) {
				System.out.println(i);

			    return i;
			}
		}
		return-1;	
	}

	public static void main(String[] args) {
		 int a[]= {6,1,9,8,5,8};
		System.out.println(findIndex(a,2));
		System.out.println(findIndex(a,8));
		System.out.println(findIndex(a,9));
		
		
		}
			
		}
	


