package week1;

// Superclass
class Shape {
    void calculateArea() {
        System.out.println("Area of shape");
    }
}

// Subclass Circle
class Circle extends Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

}
