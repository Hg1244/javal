package week7;

abstract class Parent{
	abstract void method();
	
	void sound() {   //concrete method
		System.out.println("DIVYA SOUND");
	}
	
	}

class Child extends Parent{

	@Override
	void method() {
		System.out.println("KARTHI sound");		
	}
}
class Father extends Parent{

	@Override
	void method() {
		System.out.println("Nivi sound");		
	}
	
}


public class Abs {

	public static void main(String[] args) {
		
		Parent p=new Child();
		Parent p1=new Father();
		
		p.method();
		p.sound();
		
		p1.sound();
		p1.method();
		
		
		
		
		
		}

}
