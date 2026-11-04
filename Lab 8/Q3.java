class Employee{
    String name;
    Double salary;

    Employee(String name, Double salary){
        this.name = name;
        this.salary = salary;
    }

    void displayDetails(){
        System.out.println("Name of Emplyee: " + name);
        System.out.println("Salary of Emplyee: " + salary);
    }
}

class Manager extends Employee{
    int managerId;

    Manager(String name, Double salary, int ManagerId){
        super(name, salary);
        this.managerId = ManagerId;
    
    }

    void displayDetails(){
        super.displayDetails();
        System.out.println("Manager Id of Emplyee: " + managerId);
    }
}

class Developer extends Employee{
    int devId;

    Developer(String name, Double salary, int devId){
        super(name, salary);
        this.devId = devId;
    }
    void displayDetails(){
        super.displayDetails();
        System.out.println("Developer Id of Emplyee: " + devId);

    }
}

public class Q3{
    public static void main(String[] args){
        Manager sam = new Manager("Sam", 45000.0, 3);
        sam.displayDetails();

        Developer john = new Developer("John", 33000.0, 15);
        john.displayDetails();
    }
}