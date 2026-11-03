class Employee{
    static int Num = 0;
    private String name;

    Employee(String n){
        this.name = n;
        Num++;
    }

    void displayDetails(){
        System.out.println("Name: " + this.name);
    }
    public static void counter(){
        System.out.println(Num);
    }
}

public class Q1{
    public static void main(String[] args){
        Employee e1 = new Employee("Hari");
        System.out.println("Number of Employee: ");
        Employee.counter();

        Employee e2 = new Employee("Hari");
        Employee e3 = new Employee("Hari");
        Employee e4 = new Employee("Hari");
        Employee e5 = new Employee("Hari");

        System.out.println("Number of Employee: ");
        Employee.counter();
    }
}