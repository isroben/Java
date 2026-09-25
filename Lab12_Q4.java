@FunctionalInterface
interface StringProcessor {
    String process(String str);
}

public class Lab12_Q4 {
    public static void main(String[] args) {
        // a) String Reversal implementation using Lambda
        StringProcessor reverseProcessor = str -> new StringBuilder(str).reverse().toString();

        // b) Uppercase Conversion implementation using Lambda
        StringProcessor upperCaseProcessor = str -> str.toUpperCase();

        String input = "Hello Java";

        System.out.println("Original String: " + input);
        System.out.println("Reversed String: " + reverseProcessor.process(input));
        System.out.println("Uppercase String: " + upperCaseProcessor.process(input));
    }
}