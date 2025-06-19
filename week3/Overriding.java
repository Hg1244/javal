package week3;
public class Overriding {
static class Animal {
	    public void sound() {
	        System.out.println("Some sound");
	    }
	}
static class Dog extends Animal {
	    @Override
	    public void sound() {
	    	super.sound();
	    
	        System.out.println("Bark");
	    }
	  	    	
	    
	  public static void main(String[] args) {
		  Animal a =new Dog();
		  a.sound();
	  }
	}
}
