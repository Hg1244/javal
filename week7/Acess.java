package week7;
import week7.PrivateDemo;
import week7.OPS;


public class Acess {
	public String name="JAVA";
	private int age=21;
	String program="ACCESS";
	protected double weight=24.89;
	
	public void display() {
		System.out.println(name);
		System.out.println(age);
		System.out.println(program);
		System.out.println(weight);
	}

	public static void main(String[] args) {
		
		Access_Modifiers a=new Access_Modifiers();
		a.setage(80);
		System.out.println(a.getage());
		
		
		
		OPS a1=new OPS();
		a1.setage(90);
		System.out.println(a1.getage());
		
		
		

//		System.out.println(a.age);
//		System.out.println(a.name);
//		System.out.println(a.program);
//		System.out.println(a.weight);
//		
		PrivateDemo p=new PrivateDemo();
		System.out.println(p.age);
		p.setage(67);
		System.out.println(p.getage());
		
		
	}

}
