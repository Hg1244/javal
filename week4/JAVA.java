package week4;
abstract class vechicle {
	abstract void start();
	void display(){
		System.out.println("SHE HAS NOT KNOW HOW TO START");
		}
}
class car extends vechicle{
	@Override
	void start() {
		super.display();
		System.out.println("car starting....");
		}
	}
class scooty extends vechicle{
@Override
	 void start() {
		System.out.println("HE KNOW HOW TO START BIKE");
		}
}
	
public class JAVA {
public static void main(String[] args) {
		car c=new car();
		c.start();
		scooty d=new scooty();
		d.start();
		
			}
}
