package week4;
abstract class Series{
	abstract   void maths() ;
		void display() {
			
		 System.out.println("Maths is fav subject");
	}
}
class department extends Series{

	@Override
	void maths() {
		super.display();
		System.out.println("I am belongs to a computer science department");
		}
	}
class job extends Series{

	@Override
	void maths() {
		System.out.println("I am a unemployeeee");
		}
	}

public class Runtimepoly {

	public static void main(String[] args) {
		
	department d=new department();
	d.maths();
	job j=new job();
	j.maths();
		

	}


}