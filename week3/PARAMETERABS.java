package week3;

abstract class Team{
	abstract  void group() ;
	void function() {
		System.out.println("ANIMAL SOUNDS");
		
	}
}
	
	class player extends Team{
			
		
	@Override
		void group() {	
		
			System.out.println("DOG BARKS");
			
		}
	}
	
	

public class PARAMETERABS {

	public static void main(String[] args) {
		player p=new player();
		p.function();
		p.group();
		
	}

}
