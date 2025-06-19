package week5;
public class CONS {
	 static String name;//by use of static it print the last class reference (i.e., eg: i use 11 th line class reference of c1 is hey 
	 // and to it print 2 times hey hey
	public CONS(String  d) {
	 name=d;

	}
	
public static void main(String[] args) {
	CONS c=new CONS("hi");
	CONS c1=new CONS("HEY");
	System.out.println(c.name);
	System.out.println(c1.name);
	}

}
 