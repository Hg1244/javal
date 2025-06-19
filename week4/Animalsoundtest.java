package week4;
interface wildanimals{
	void sound();
	
}
class puppy implements wildanimals{

@Override
	public void sound() {
		System.out.println("puppy SAYS:WOOF WOOF");
	}
	
}
class kitty implements wildanimals{

	@Override
	public void sound() {
		System.out.println("CAT SAYS:MEOW MEOW");
		
	}
	
}
public class Animalsoundtest {

	public static void main(String[] args) {
		wildanimals m=new puppy();
		wildanimals n=new kitty();
		
		m.sound();
		n.sound();
	}

}
