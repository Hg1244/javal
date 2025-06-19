package week4;
interface printable{
	void print();
	
	
}
class documents implements printable{

	@Override
	public void print() {
		System.out.println("TO print a message");
		
	}
	
}
public class Document {

	public static void main(String[] args) {
     printable p=new documents();
     p.print();

	}

}
