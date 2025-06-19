package week4;
public class Pro {
	public static void main(String[] args) {
		try {
			method1();//call method1
		}catch (Exception e){
			System.out.println("Exception caught in main:"+e);
			
		}
		System.out.println("give main");
           method1(); 
		        System.out.println("End of main");
		    }
       static void method1() {
		        method2();  
		    }

		    static void method2() {
		        int x = 10 / 2;  
		        System.out.println(x);
		    }
		}
