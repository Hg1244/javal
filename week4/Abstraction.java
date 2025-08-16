package week4;

 class Shape {
   void Calculatearea() { //abstractmethod
	  
        System.out.println("Calculating area...");
    }
}

// Subclass 1: Circle
class Circle extends Shape {
    double radius = 5;

    @Override
    void Calculatearea() {
        double result = 3.14 * radius * radius;
        System.out.println("Area of Circle: " + result);
    }
}

// Subclass 2: Rectangle
class Rectangle extends Shape {
    int length = 10;
    int breadth = 20;

    @Override
    void Calculatearea() {
    	super.Calculatearea();
        int result = length * breadth;
        System.out.println("Area of Rectangle: " + result);
    }
}



public class Abstraction {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        Circle c1 = new Circle();
        r1.Calculatearea();
        c1.Calculatearea();

       
    }
}
