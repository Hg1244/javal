package week4;
interface Vehicle {
     default void run() {
    	 System.out.println("I AM A RIDER");
	} 
}
class Bike implements Vehicle {
    public void run() {
        System.out.println("Bike is running");
    }
}

public class ABS {
    public static void main(String[] args) {
        Bike b = new Bike();
        b.run();
       
        
        // Output: Bike is running
    }
}

