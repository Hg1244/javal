package week7;

public class Access_Modifiers {
	public String name = "Dog";        // Accessible everywhere
    protected int age;// Same package + subclasses
    
    public void setage(int a) {
    	age=a;
    }
    
    public int getage() {
    	return age;
    }
    String color = "Brown";            // default — same package only
    private double weight = 12.5;      // Only within this class

	
    public void show() {
    	System.out.println(name);
    	System.out.println(age);
    	System.out.println(color);
    	System.out.println(weight);
    }
    public static void main(String[]args) {
    	Access_Modifiers a =new Access_Modifiers();
    	System.out.println(a.weight);
    	System.out.println(a.age);
    	System.out.println(a.color);
    	System.out.println(a.name);
    	
    	
    	
    }
}