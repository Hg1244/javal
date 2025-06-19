package week4;
abstract class BankAccount{
	abstract void calculateInterest();

	void calculateInterest1() {
	
		System.out.println("create 2 sub classses");
}
	
}


class SavingsAccount extends BankAccount{
     
	@Override
	
	void calculateInterest() {
		super.calculateInterest1();
		
		System.out.println("save the money");
		
		
	
	}
}

class FixedDepositAccount extends BankAccount{

	@Override
	void calculateInterest() {

		System.out.println("fix the money");
		
	}


	
}
public class OVERRIDING {

	public static void main(String[] args) {
		SavingsAccount s=new SavingsAccount ();
		s.calculateInterest();
		FixedDepositAccount f=new FixedDepositAccount();
		f.calculateInterest();

	}

};
