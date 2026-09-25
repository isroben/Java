import java.util.*;

public class Lab11_Q2 {
    public static void main(String[] args) {
        // 1. ArrayList
        System.out.println("=== 1. ArrayList Operations ===");
        List<Integer> arrayList = new ArrayList<>();
        arrayList.add(40); arrayList.add(10); arrayList.add(30); arrayList.add(20); // (a) Add
        System.out.println("Initial List: " + arrayList); // (e) Display
        
        arrayList.remove(Integer.valueOf(30)); // (b) Remove
        System.out.println("After removing 30: " + arrayList);
        
        System.out.println("Contains 20? " + arrayList.contains(20)); // (c) Search
        
        Collections.sort(arrayList); // (d) Sort
        System.out.println("Sorted ArrayList: " + arrayList);

        // 2. LinkedList
        System.out.println("\n=== 2. LinkedList Operations ===");
        List<Integer> linkedList = new LinkedList<>();
        linkedList.add(50); linkedList.add(15); linkedList.add(25); // (a) Add
        System.out.println("Initial List: " + linkedList); // (e) Display
        
        linkedList.remove(0); // (b) Remove by index
        System.out.println("After removing index 0: " + linkedList);
        
        System.out.println("Contains 15? " + linkedList.contains(15)); // (c) Search
        
        Collections.sort(linkedList); // (d) Sort
        System.out.println("Sorted LinkedList: " + linkedList);

        // 3. HashSet (Unordered unique elements)
        System.out.println("\n=== 3. HashSet Operations ===");
        Set<Integer> hashSet = new HashSet<>();
        hashSet.add(90); hashSet.add(10); hashSet.add(50); // (a) Add
        System.out.println("Initial HashSet: " + hashSet); // (e) Display
        
        hashSet.remove(10); // (b) Remove
        System.out.println("After removing 10: " + hashSet);
        
        System.out.println("Contains 50? " + hashSet.contains(50)); // (c) Search
        
        List<Integer> sortedSetList = new ArrayList<>(hashSet);
        Collections.sort(sortedSetList); // (d) Sort via List conversion
        System.out.println("Sorted Set Elements: " + sortedSetList);

        // 4. HashMap (Key-Value pairs)
        System.out.println("\n=== 4. HashMap Operations ===");
        Map<Integer, Integer> hashMap = new HashMap<>();
        hashMap.put(1, 100); hashMap.put(3, 300); hashMap.put(2, 200); // (a) Add/Insert
        System.out.println("Initial HashMap: " + hashMap); // (e) Display
        
        hashMap.remove(3); // (b) Remove key
        System.out.println("After removing key 3: " + hashMap);
        
        System.out.println("Contains value 200? " + hashMap.containsValue(200)); // (c) Search
        
        Map<Integer, Integer> sortedMap = new TreeMap<>(hashMap); // (d) Sort by key using TreeMap
        System.out.println("Sorted HashMap (by Key): " + sortedMap);
    }
}