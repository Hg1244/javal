package week7;

class dog{
	void show() {
				
		System.out.println("THE DOG WILL BARKS");
	}
}
class lion extends dog{
	void show() {
		super.show();
		System.out.println("THE LION WILL EAT FLESH");
	}
}

class cat extends lion{
	void show() {
		super.show();
		System.out.println("THE CAT WILL EAT FISH");
	}
}

public class Inheri {

	public static void main(String[] args) {
		
		dog o = new lion();
		dog c=new cat();
		dog d=new dog();
		
		System.out.println("dog o.show():");
	    o.show();
	    
	    System.out.println("\ndog o.show():");
	    o.show();
	    
	    System.out.println("\ndog o.show()");
	    o.show();
	    
	    
	   
		}
}
