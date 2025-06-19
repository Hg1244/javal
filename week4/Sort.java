package week4;
import java.util.Arrays;
public class Sort {
 public static void main(String[] args) {
int [] a= {3,2,4,7,4,6,5,1,5,6};
	int [] b= {4,5,7,6,10,9};
	
	for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				if (a[i] > a[j]) {
				int temp=a[i] ;
				a[i]=a[j];
				a[j]=temp; 
			}
		}
	}	
				for (int k = 0; k < b.length; k++) {
					for (int s = k+1; s < b.length; s++) {
				  if(b[k]>b[s]) {
						int temp=b[k];
						b[k]=b[s];
						b[s]=temp;
						
					}
				}
		}
		
	
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));
		
	}
		
	}

