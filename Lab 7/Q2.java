class Q2 {

    // Call by Value
    static void callByValue(int x) {
        x = x + 10;
        System.out.println("Value inside method: " + x);
    }

    // Demonstrating reference passing using an object
    static void callByReference(Student s) {
        s.marks = s.marks + 10;
        System.out.println("Marks inside method: " + s.marks);
    }

    public static void main(String[] args) {

        // Call by Value
        int a = 20;

        System.out.println("Before call by value: " + a);
        callByValue(a);
        System.out.println("After call by value: " + a);

        System.out.println();

        // Object reference example
        Student st = new Student();

        System.out.println("Before modifying object: " + st.marks);
        callByReference(st);
        System.out.println("After modifying object: " + st.marks);
    }
}

class Student {
    int marks = 50;
}
