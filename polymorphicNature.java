// Parent class
class Shape {
    void area() {
        System.out.println("Area of Shape is undefined.");
    }
}

// Subclass 1: Triangle
class Triangle extends Shape {
    double base;
    double height;

    Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    // Overriding the area() method
    @Override
    void area() {
        double result = 0.5 * base * height;
        System.out.println("Area of Triangle: " + result);
    }
}

// Subclass 2: Rectangle
class Rectangle extends Shape {
    double length;
    double width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Overriding the area() method
    @Override
    void area() {
        double result = length * width;
        System.out.println("Area of Rectangle: " + result);
    }
}

// Main Class
public class polymorphicNature {
    public static void main(String[] args) {
        // Parent class reference pointing to a Triangle object
        Shape s1 = new Triangle(10.0, 5.0);

        // Parent class reference pointing to a Rectangle object
        Shape s2 = new Rectangle(8.0, 4.0);

        System.out.println("--- Polymorphism Demo ---");
        
        // Polymorphic call: executes Triangle's area()
        s1.area();

        // Polymorphic call: executes Rectangle's area()
        s2.area();
    }
}