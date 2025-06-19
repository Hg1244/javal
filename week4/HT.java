package week4;

abstract class Team{
	
	 abstract void function();
	
}
	class player extends Team{
		player() {
			System.out.println("CONSTRUCTOR CALLED");
			}
			
	
			@Override
			void function() {
				System.out.println("looooo");
				
			}
	}
	
	public class HT {
public static void main(String[] args) {
		player p=new player();
		p.function();
	}
}


//ChatGPT said: