package week4;


abstract class Animal {
    abstract void group();

    void function() {
        System.out.println("ANIMAL SOUNDS");
    }


class Dog extends Animal {
    @Override
    void group() {
        System.out.println("DOG BARKS");
    }
}

public class PARAMATERS1{
    public static void main(String[] args) {
        Dog d = new Dog();
        d.function(); // ANIMAL SOUNDS
        d.group();    // DOG BARKS
    }
}

