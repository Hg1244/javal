package week4;
abstract class animal{
	void max() {
		System.out.println("strong");
	}
	
}
 class dog extends animal{
	 
	 void max() {
		 System.out.println("weak");
	 }
	 
	 
	 
 }
public class METHOD1 {
public static void main(String[] args) {
		dog d=new dog();
		d.max();
		
		

	}

}
