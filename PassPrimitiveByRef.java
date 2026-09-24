class IntWrapper {
    int value;

    IntWrapper(int value) {
        this.value = value;
    }
}

public class PassPrimitiveByRef {
    public static void modify(IntWrapper num) {
        num.value = 50;
    }

    public static void main(String[] args) {
        IntWrapper a = new IntWrapper(10);
        
        System.out.println("Before: " + a.value); // Output: Before: 10
        modify(a);
        System.out.println("After:  " + a.value); // Output: After:  50 (Fixed typo here)
    }
}