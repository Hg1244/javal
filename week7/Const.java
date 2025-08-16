package week7;

public class Const {
	class Student{
		String name;
		
	
		 Student(String s) {
			name= s;
				
	}
		 		 void display() {
		 System.out.println(name);
	 }
	}
	 public static void main (String[]args) {
		 Const c=new Const();
		 Student s1=c.new Student("RAJI");
		// Student = c.new Student(s1);
		 s1.display();
		// s2.display();
	 }
}