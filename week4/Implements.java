package week4;

interface Shape1 {
    void getArea();
    String name = "Shapes";
}

class Diamond implements Shape1 {
    @Override
    public void getArea() {
        String method = "Diamond";
        System.out.println("Diamond is expensive: " + (name + method));
    }
}

class Triangle implements Shape1 {
    @Override
    public void getArea() {
        String method = "Triangle";
        System.out.println("The Traingle has 3 sides: " + (name + method));
    }
}

public class Implements {
    public static void main(String[] args) {
        Shape1 s = new Diamond();
        s.getArea();
        Shape1 s2=new Triangle ();
        s2.getArea();
    }
}
