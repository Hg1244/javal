package week4;

abstract class animall {
    abstract void sound(int times);

    void display() {
        System.out.println("collect animals and their sounds");
    }
}

class dogiee extends animall {

    @Override
    void sound(int times) {
        super.display();
        for (int i = 0; i < times; i++) {
            System.out.println("BOW BOW");
        }
    }
}

class cat extends animall {

    @Override
    void sound(int times) {
        for (int i = 0; i < times; i++) {
            System.out.println("meow meow");
        }
    }
}

public class ABMETHOD {

    public static void main(String[] args) {
        dogiee d = new dogiee();
        d.sound(3);

        cat c = new cat();
        c.sound(5);
    }
}
