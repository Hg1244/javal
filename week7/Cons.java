package week7;

public class Cons {
	class mother{
		String name;
		int age;
		
		mother(String n,int i){
			name=n;
			age=i;
		}
	void display() {
		System.out.println(name+" "+age);
	}
	}
	public static void main (String[]args) {
		Cons c=new Cons();
		mother m=c.new mother("LAKSHMI",47);
		m.display();
		
//		Access_Modifiers a=new Access_Modifiers();
//		System.out.println(a.age);
//		System.out.println(a.color);
//		System.out.println(a.name);
	}
}