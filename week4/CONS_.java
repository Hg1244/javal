package week4;

class employee{
	String empname;
	employee(String name){
		this.empname=name;
		System.out.println("Employee Constructor:"+empname);
		}
}

class manager extends employee{
	String dept;
	manager(String name, String dept) {
		super(name);
		this.dept=dept;
		System.out.println("MANAGER CONSTRUCTOR:DEPARTMENT-"+dept);
	}
	
}
public class  CONS_{
	public static void main(String[]args) {
		manager m1=new manager("nivi","HR");
	
}
}