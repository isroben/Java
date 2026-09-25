import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Lab12_Q5 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(-4, 2, 5, -2, 2, 3, 5, -4);

        System.out.println("Original List: " + numbers);

        // Stream API operations
        List<Integer> result = numbers.stream()
                .distinct()               // Remove duplicates
                .map(n -> n * n)          // Map each remaining number to its square
                .collect(Collectors.toList());

        System.out.println("Processed List (Unique Squares): " + result);
    }
}