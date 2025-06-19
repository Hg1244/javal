package week3;
class Father{
	public void father(){
		System.out.println("No one can love daughter than her father");
		
	}
}

class daughterr  extends Father{
	public  void daughterr() {
		super.father();
		System.out.println("She is  longing for him");
	}
}
class love extends Father{
	public void love() {
		System.out.println("I love you appa");
	}
}
public class HierarchicalInheritance {

	public static void main(String[] args) {
		daughterr d=new daughterr();
		d.daughterr();
		
		love l=new love();
		l.love();
		
	    
	}

}
