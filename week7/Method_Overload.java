package week7;

public class Method_Overload extends Acess{
	
	class mother{
		int add(int a,int b) {
			return a+b;
		}
	}
	
	class child{
		 float add(float a,float b) {
			 return a+b;
		 }
	}
	
	class father{
		double add(double a,double b) {
			return a+b;
		}
	}

	public static void main(String[] args) {
		Method_Overload o = new Method_Overload(); 
		mother m=o.new mother();
		child c=o.new child();
		father f =o.new father();
		
		System.out.println(m.add(2, 90));
		System.out.println(c.add(9, 8));
		System.out.println(f.add(8, 80));
		
		Acess a=new Acess();
		System.out.println(a.name);
		System.out.println(a.weight);
		
		
	}

}
