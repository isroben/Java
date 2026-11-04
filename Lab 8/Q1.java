class Person{
    String name;
    String address;

    Person(){}
    Person(String name, String address){
        this.name = name;
        this.address = address;
    }
    public void displayPerson(){
        System.out.println("Name of Student: " + name);
        System.out.println("Address of Student: " + address);
    }
}

class Student extends Person{
    int rollNo;

    Student(int roll, String name, String address){
        super(name, address);
        this.rollNo = roll;
    }

    public void displayStudent(){
        super.displayPerson();
        System.out.println("Roll of Student: " + rollNo);
    }
}

public class Q1{
    public static void main(String[] args){
        Student s = new Student(2, "Hari", "Pokhara");

        s.displayStudent();
    }
}