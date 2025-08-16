package week7;
public class Inheritance extends OPS{
class bank{
	void bank() {
		System.out.println("WELCOME TO BANK");
	}
}
class bank_of_baroda extends bank{
	@Override
	void bank() {
		System.out.println("THIS IS BANK OF BARODA");
		
	}
}

class HDFC_Bank extends bank_of_baroda{
	@Override
	void bank() {
		System.out.println("THIS IS HDFC BANK");
	}
}


	public static void main(String[]args) {
		
	Inheritance i=new Inheritance();
	OPS o = new OPS();
	o.setage(21);
	System.out.println(o.getage());
	
	bank b=i.new bank();
	b.bank();
	
	bank_of_baroda r=i.new bank_of_baroda ();
	r.bank();
	
	HDFC_Bank h=i.new HDFC_Bank();
	h.bank();
	
	bank c;     
	c = i.new bank();
	c.bank();

	c = i.new bank_of_baroda();
	c.bank();

	c = i.new HDFC_Bank();
	c.bank();
	
	
	
	}
}