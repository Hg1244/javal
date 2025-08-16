package week7;

public class OPS {
	public String lanuage="java";
	//private  int   method;
	private int Marks;
	
	protected int age;
	
	public void setage(int m) {
		age=m;
	}
	
	public int getage() {
		return age;
	}
	
	
	
	protected float program=34;
	String degination = "HTML";
	
	public void setMarks(int a) {
	Marks=a;
		
	}
	public int getMarks() {
		return Marks;
	}
	
	
	public void show() {
		System.out.println(lanuage);
		//System.out.println(method);
		System.out.println(program);
		System.out.println(degination);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OPS a= new OPS();
		System.out.println(a.degination);
       System.out.println(a.lanuage);
   //    System.out.println(a.method);
       System.out.println(a.program);
       a.setMarks(56);
       System.out.println(a.getMarks());
       
	}

}
