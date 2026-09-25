import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Lab11_Q4 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            numbers.add(i);
        }

        System.out.println("Original List: " + numbers);

        // Iterating and removing even numbers safely
        Iterator<Integer> iterator = numbers.iterator();
        while (iterator.hasNext()) {
            int num = iterator.next();
            if (num % 2 == 0) {
                iterator.remove(); // Removes current even number
            }
        }

        System.out.println("List after removing even numbers: " + numbers);
    }
}