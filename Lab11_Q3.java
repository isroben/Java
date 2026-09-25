import java.util.TreeSet;

public class Lab11_Q3 {
    public static void main(String[] args) {
        TreeSet<Integer> numbers = new TreeSet<>();

        // Inserting elements out of order
        numbers.add(45);
        numbers.add(12);
        numbers.add(89);
        numbers.add(3);
        numbers.add(27);

        System.out.println("TreeSet automatically sorts elements upon insertion:");
        System.out.println(numbers);
    }
}