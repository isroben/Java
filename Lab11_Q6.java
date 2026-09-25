import java.util.*;

public class Lab11_Q6 {

    // Unbounded Wildcard <?>
    public static void printList(List<?> list) {
        System.out.println("Unbounded List: " + list);
    }

    // Upper Bounded Wildcard <? extends Number> (Accepts Number and its subclasses)
    public static double sumOfList(List<? extends Number> list) {
        double sum = 0.0;
        for (Number num : list) {
            sum += num.doubleValue();
        }
        return sum;
    }

    // Lower Bounded Wildcard <? super Integer> (Accepts Integer and its superclasses)
    public static void addIntegers(List<? super Integer> list) {
        list.add(10);
        list.add(20);
        System.out.println("Lower Bounded List: " + list);
    }

    public static void main(String[] args) {
        // Unbounded
        List<String> strList = Arrays.asList("Java", "Generics");
        printList(strList);

        // Upper Bounded
        List<Double> doubleList = Arrays.asList(1.5, 2.5, 3.5);
        System.out.println("Sum of doubleList: " + sumOfList(doubleList));

        // Lower Bounded
        List<Number> numList = new ArrayList<>();
        addIntegers(numList);
    }
}