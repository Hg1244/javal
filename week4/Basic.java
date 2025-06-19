package week4;
interface birds{
		
		void makesound();
	String sound= "crow and parrot";
	
}
class crow implements birds{

	@Override
	public void makesound() {
    String voice="kakaka";
    System.out.println("crow  sound kakaka kaaa:"+(sound +voice));

		
	}
	
}

class parrot implements birds{

	@Override
	public void makesound() {
    String voice="kokoko";
    System.out.println("parrot sound kokokooo:"+(sound+voice));
    
		
	}
	
}
public class Basic {

	public static void main(String[] args) {
		birds b= new crow();
		b.makesound();
		birds b1=new parrot();
		b1.makesound();

	}

}
