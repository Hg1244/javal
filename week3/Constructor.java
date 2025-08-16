package week3;
//import week5.ACCESS;
//import week7.OPS;


public class Constructor  {
	
	private int age;
	
	 public  void setage(int v) {
		 age=v;
	 }
	 public int getage() {
		 return age;
	 }
//	 
//	static String name ;
//	public Constructor (String S){
//		name= S;
//		}

	public static  void main(String[] args) {
//		//Constructor c =new Constructor("h1");
//		Constructor c1=new Constructor("h2");
//		System.out.println(c1.name);
//		//System.out.println(c.name);
//     ACCESS a=new ACCESS();
     
   
		Constructor c=new Constructor();
		c.setage(78);
		System.out.println(c.getage());

    
     
     
//     a.setage(25);   
//    System.out.println(a.getage());
//    a.setname("nivi");
//		System.out.println(a.getname());
		

	}

}
