package week4;
//interface
interface Payment {
    void processPayment(double amount);
}

//two class implements
//1.creaditcardpayment
class CreditCardPayment implements Payment {
    public void processPayment(double amount) {
        System.out.println("Processing credit card payment of ₹" + amount);
    }
}

//2.UPIpayment
class UPIPayment implements Payment {
    public void processPayment(double amount) {
        System.out.println("Processing UPI payment of ₹" + amount);
    }
}
//abstract class transaction
abstract class Transaction {
    abstract void generateReceipt();
}


class CreditCardTransaction extends Transaction {
    public void generateReceipt() {
        System.out.println("Receipt: Credit Card Transaction successful.");
    }
}

class UPITransaction extends Transaction {
    public void generateReceipt() {
        System.out.println("Receipt: UPI Transaction successful.");
    }
}

public class ABS_INTER {

	public static void main(String[] args) {
		 Payment payment1 = new CreditCardPayment();
	        Transaction transaction1 = new CreditCardTransaction();
	        payment1.processPayment(1500);
	        transaction1.generateReceipt();

	        Payment payment2 = new UPIPayment();
	        Transaction transaction2 = new UPITransaction();
	        payment2.processPayment(750);
	        transaction2.generateReceipt();
	}

}
