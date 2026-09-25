public class Exceptions {
    public static void main(String[] args) {

        // 1. ArithmeticException
        System.out.println("--- 1. ArithmeticException ---");
        try {
            int a = 10;
            int b = 0;
            int result = a / b; // Division by zero
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Caught Exception: Cannot divide an integer by zero!");
        }

        // 2. ArrayIndexOutOfBoundsException
        System.out.println("\n--- 2. ArrayIndexOutOfBoundsException ---");
        try {
            int[] numbers = {10, 20, 30};
            // Accessing index 5 when array length is only 3
            System.out.println("Element at index 5: " + numbers[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught Exception: Array index is out of bounds!");
        }

        // 3. NullPointerException
        System.out.println("\n--- 3. NullPointerException ---");
        try {
            String text = null;
            // Calling a method on a null object reference
            System.out.println("Length of string: " + text.length());
        } catch (NullPointerException e) {
            System.out.println("Caught Exception: Attempted to operation on a null object reference!");
        }

        // 4. NumberFormatException
        System.out.println("\n--- 4. NumberFormatException ---");
        try {
            String invalidNum = "ABC";
            // Trying to parse non-numeric string into an integer
            int num = Integer.parseInt(invalidNum);
            System.out.println("Parsed Number: " + num);
        } catch (NumberFormatException e) {
            System.out.println("Caught Exception: Cannot convert string with letters to a number!");
        }

        System.out.println("\nProgram completed successfully after handling all exceptions.");
    }
}