class Person{
    private String name;
    private String address;

    public Person(){}

    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public void displayPerson(){
        System.out.println("Name of Person: " + name);
        System.out.println("Address of Person: " + address);
    }
}

class Student extends Person{
    private int rollNo;

    Student(){}

    public Student(String name, String address, int rollNo) {
        // Calling base class constructor using super
        super(name, address);
        this.rollNo = rollNo;
    }


    @Override   // Derived class display method (Overriding)
    public void displayPerson(){
        // Display base class details first
        super.displayPerson();
        System.out.println("Roll of Person is: " + rollNo);
    }
}

public class SingleInheritanceDemo{
    public static void main(String[] args){
        Student s1 = new Student("Roben", "Dhading", 27);

        s1.displayPerson();
    }
}

