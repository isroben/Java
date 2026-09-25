class AreaCalculator {

    // Overloaded method 1: To calculate Area of Circle (1 parameter)
    void area(double radius) {
        double result = Math.PI * radius * radius;
        System.out.println("Area of Circle: " + result);
    }

    // Overloaded method 2: To calculate Area of Triangle (2 parameters)
    void area(double base, double height) {
        double result = 0.5 * base * height;
        System.out.println("Area of Triangle: " + result);
    }
}

// Main class
public class functionOverloading {
    public static void main(String[] args) {
        AreaCalculator calc = new AreaCalculator();

        System.out.println("--- Method Overloading Demo ---");

        // Calling area method for Circle
        calc.area(7.0);

        // Calling area method for Triangle
        calc.area(10.0, 5.0);
    }
}