// Superclass
class Employee {
    String name;
    double salary;

    // Parameterized Constructor
    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    void displayEmployee() {
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }
}

// Subclass 1
class Manager extends Employee {
    String department;

    Manager(String name, double salary, String department) {
        super(name, salary); // Calling superclass constructor
        this.department = department;
    }

    void displayManager() {
        System.out.println("\n--- Manager Details ---");
        displayEmployee(); // Calling superclass method
        System.out.println("Department: " + department);
    }
}

// Subclass 2
class Developer extends Employee {
    String programmingLanguage;

    Developer(String name, double salary, String programmingLanguage) {
        super(name, salary); // Calling superclass constructor
        this.programmingLanguage = programmingLanguage;
    }

    void displayDeveloper() {
        System.out.println("\n--- Developer Details ---");
        displayEmployee(); // Calling superclass method
        System.out.println("Programming Language: " + programmingLanguage);
    }
}

// Main Class
public class HierarchicalInherit {
    public static void main(String[] args) {
        // Creating objects for both subclasses
        Manager m = new Manager("Alice", 75000, "IT");
        Developer d = new Developer("Bob", 60000, "Java");

        // Displaying details
        m.displayManager();
        d.displayDeveloper();
    }
}