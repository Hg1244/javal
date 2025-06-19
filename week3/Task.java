package week3;
class RBI {
    int interest = 7;
    int amount = 20000;
void calcInt() {
        System.out.println("NO INTEREST FOR RBI");
    }
}
class HDFC extends RBI {
    int interest = 7;
    int amount = 15000;
    @Override
    void calcInt() {

        System.out.println("HDFC Interest on RBI amount: " + (super.amount * interest / 100));
    }
}
class ICICI extends RBI {
    int interest = 8;
    int amount = 2000;

    @Override
    void calcInt() {
        // Own interest calculation
        System.out.println("ICICI Interest: " + (interest * amount / 100));
    }
}
public class Task {
    public static void main(String[] args) {
        RBI r = new RBI();
        RBI h = new HDFC();
        RBI i = new ICICI();
        r.calcInt();  // RBI's version
        h.calcInt();  // HDFC's version
        i.calcInt();  // ICICI's version
    }
}
