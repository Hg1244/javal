package week7;
interface Parent{
	 void method();
	
	default void sound() {   //concrete method
		System.out.println("DIVYA SOUND");
	}
	
	}

class Child implements Parent{

	@Override
	public void method() {
		System.out.println("KARTHI sound");		
	}
}
class Father implements Parent{

	@Override
	public void method() {
		System.out.println("Nivi sound");		
	}
	
}


public class ABSTRACT {

	public static void main(String[] args) {
		Parent p=new Child();
		Parent p1=new Father();
		
		p.method();
		p.sound();
		
		//p1.sound();
		p1.method();
		
		
		
		
		
		}



	}


