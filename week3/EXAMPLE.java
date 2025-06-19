package week3;

public abstract class EXAMPLE {
    int a = 10;

    void function() {
        System.out.println("12");
    }

    // ✅ Put main inside EXAMPLE
    public static void main(String[] args) {
        ens ac = new ens();
        ac.display();
        ac.function();
    }
}

class ens extends EXAMPLE {
    int b = 20;

    void display() {
        System.out.println("321");
    }
}
