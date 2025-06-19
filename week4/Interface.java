package week4;
interface bank{
	void interest();
	int amount=2000;
	}
class SBI implements bank{
	@Override
	public void interest() {
		int price=3000;
	System.out.println("the loan amount is:"+(amount+price));
		}
	}
class BOB implements bank{
@Override
	public void interest() {
		int price=40000;
		System.out.println("the loan amount is:"+(amount+price));
		}
	}
class ICICI implements bank{

	@Override
	public void interest() {
		int price=50000;
		System.out.println("the loan amount is:"+(amount+price));
		
	}
	
}
public class Interface {
public static void main(String[] args) {
		bank b=new SBI();
		b.interest();
		bank b1=new BOB();
		b1.interest();
		bank b2=new ICICI();
		b2.interest();
		}
}
