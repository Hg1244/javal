package week4;

// Abstract class
abstract class Animals {
    // Constructor
    public Animals() {
        System.out.println("Animal Constructor Called.");
    }

    // Abstract method
    abstract void makeSound();
}

// Subclass Cow
class Cow extends Animals {
    // Constructor
    public Cow() {
        super(); // Calls Animal constructor
        System.out.println("Cow Constructor Called.");
    }

    @Override
    void makeSound() {
        System.out.println("MAAAAAA MAAAA");
    }
}

// Subclass Snake
class Snake extends Animals {
    public Snake() {
        super(); // Calls Animal constructor
        System.out.println("Snake Constructor Called.");
    }

    @Override
    void makeSound() {
        System.out.println("sssss ssss");
    }
}

// Main class
public class CONS {
    public static void main(String[] args) {
        Cow c = new Cow();
        c.makeSound();

        Snake s = new Snake();
        s.makeSound();
    }
}
