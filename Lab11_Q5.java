import java.util.*;

class Student {
    int rollNo;
    String name;
    double marks;

    public Student(int rollNo, String name, double marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "RollNo: " + rollNo + ", Name: " + name + ", Marks: " + marks;
    }
}

public class Lab11_Q5 {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(103, "Charlie", 85.5));
        students.add(new Student(101, "Alice", 92.0));
        students.add(new Student(102, "Bob", 78.0));

        // 1. Sort by Marks (Descending)
        students.sort(Comparator.comparingDouble((Student s) -> s.marks).reversed());
        System.out.println("--- Sorted by Marks (High to Low) ---");
        students.forEach(System.out::println);

        // 2. Sort by Name (Alphabetical)
        students.sort(Comparator.comparing(s -> s.name));
        System.out.println("\n--- Sorted by Name ---");
        students.forEach(System.out::println);

        // 3. Sort by Roll Number (Ascending)
        students.sort(Comparator.comparingInt(s -> s.rollNo));
        System.out.println("\n--- Sorted by Roll Number ---");
        students.forEach(System.out::println);
    }
}