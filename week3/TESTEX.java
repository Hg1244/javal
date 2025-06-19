package week3;

class Parent{
	int k=12;
	public void display() {
		System.out.println("APPPPPAAAA");
	}
}

public class TESTEX extends Parent {
	
	public void d1() {
		
		System.out.println("example of re use");
	}
	@Override
	public void display()
	 {
		super.display();
		System.out.println("i will run 22000 times");
	}
	public static void main(String[] args) {
	TESTEX t =new TESTEX();
	t.display();
	          // calls parent class constructor

	}

}
