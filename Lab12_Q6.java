import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Lab12_Q6 {
    public static void main(String[] args) {
        // 1. Optional Class Demonstration
        String str = "Hello World";
        Optional<String> checkNull = Optional.ofNullable(str);

        if (checkNull.isPresent()) {
            System.out.println("Optional Value: " + checkNull.get());
        } else {
            System.out.println("Value is null.");
        }

        // 2. Method References Demonstration (System.out::println)
        List<String> languages = Arrays.asList("Java", "Python", "C++", "Go");

        System.out.println("\n--- Traversing using Method Reference ---");
        languages.forEach(System.out::println); // Equivalent to s -> System.out.println(s)
    }
}