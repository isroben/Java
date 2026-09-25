public class Lab11_Q1 {
    public static void main(String[] args) {
        // --- Autoboxing (Primitive -> Wrapper Object) ---
        Integer intObj = 100;           // int to Integer
        Double doubleObj = 45.67;       // double to Double
        Character charObj = 'A';        // char to Character
        Boolean boolObj = true;         // boolean to Boolean

        System.out.println("--- Autoboxed Objects ---");
        System.out.println("Integer Object: " + intObj);
        System.out.println("Double Object: " + doubleObj);
        System.out.println("Character Object: " + charObj);
        System.out.println("Boolean Object: " + boolObj);

        // --- Unboxing (Wrapper Object -> Primitive) ---
        int primitiveInt = intObj;
        double primitiveDouble = doubleObj;
        char primitiveChar = charObj;
        boolean primitiveBool = boolObj;

        System.out.println("\n--- Unboxed Primitives ---");
        System.out.println("Primitive int: " + primitiveInt);
        System.out.println("Primitive double: " + primitiveDouble);
        System.out.println("Primitive char: " + primitiveChar);
        System.out.println("Primitive boolean: " + primitiveBool);
    }
}