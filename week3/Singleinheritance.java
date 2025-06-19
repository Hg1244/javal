package week3;

class Family{
	public void father() {
		System.out.println("Father loves his family");
	
	}
	
	}
class daughter extends Family{
	public daughter() {
		
		System.out.println("She now going to miss her family");
	}
	
}
	


public class Singleinheritance {
	

	public static void main(String[] args) {
		daughter d=new daughter();
		d.father();
	    		
	}

}
