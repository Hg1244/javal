package week5;
import week3.Constructor;

public class ACCESS {
	
	private String name;
	private int age;
	
	public String getname() {
		return name;
	}
		public void setname(String name) {
		this.name= name;
		
 }
		public int getage() {
			return age;
		}
		public void setage(int age) {
			 this.age=age;
		}
	
public static void main (String[]args) {
	ACCESS a=new ACCESS();
	a.setname("NIVI");
	System.out.println(a.getname());
}
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	