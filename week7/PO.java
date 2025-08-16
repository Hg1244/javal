package week7;


class operation{
	void calculate(int a,int b) {
		System.out.println("IMPLEMENT THE OPERATIONS");
	}
}


class add extends operation{
	
	
@Override

 void calculate(int a,int b) {
	super.calculate(2, 3);
	System.out.println("ADD THE OPERATIONS:"+(a+b));
}
	
}

class sub extends operation{
@Override
void calculate(int a,int b) {
	System.out.println("SUB THE OPERATIONS:"+  (a-b));
}
}

class multiply extends operation{
@Override
void calculate(int a,int b) {
	System.out.println("MULTIPLY THE OPERATIONS:"+  (a*b));
}
}
class divide extends operation{
@Override
void calculate(int a,int b) {
  System.out.println("DIVIDE THE OPERATIONS:"+  (a/b));
	
}
}

public class PO {

	public static void main(String[] args) {
	
		add a =new add();
		sub b=new sub();
		multiply m=new multiply();
		divide d=new divide();
		
		a.calculate(5, 8);
		b.calculate(8, 5);
		m.calculate(6, 6);
		d.calculate(8, 2);
		
	}

}
