// Base class: Level 1
class Addition {
    public double add(double a, double b) {
        return a + b;
    }
}

// Derived class 1: Level 2 (Inherits Addition)
class Subtraction extends Addition {
    public double subtract(double a, double b) {
        return a - b;
    }
}

// Derived class 2: Level 3 (Inherits Subtraction & Addition)
class Multiplication extends Subtraction {
    public double multiply(double a, double b) {
        return a * b;
    }
}

// Final Derived class: Level 4 (Inherits Multiplication, Subtraction, & Addition)
class DivisionCalculator extends Multiplication {
    public double divide(double a, double b) {
        if (b == 0) {
            System.out.println("Error: Division by zero is not allowed!");
            return Double.NaN;
        }
        return a / b;
    }
}

// Main Class
public class CalculatorApp {
    public static void main(String[] args) {
        // Single object of the bottom-most class has access to ALL operations
        DivisionCalculator calc = new DivisionCalculator();

        double num1 = 20.0;
        double num2 = 5.0;

        System.out.println(" Multilevel Inheritance Calculator: ");
        System.out.println("Number 1: " + num1 + ", Number 2: " + num2);
        System.out.println("-----------------------------------------");
        
        System.out.println("Addition : " + calc.add(num1, num2));
        System.out.println("Subtraction : " + calc.subtract(num1, num2));
        System.out.println("Multiplication : " + calc.multiply(num1, num2));
        System.out.println("Division : " + calc.divide(num1, num2));
    }
}