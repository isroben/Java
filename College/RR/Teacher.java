package College.RR;

public class Teacher {
    private int id;
    private String name;
    private String faculty;
    private Double salary;

    public Teacher(int id, String name, String faculty, Double salary){
        this.id = id;
        this.name = name;
        this.faculty = faculty;
        this.salary = salary;
    }
    public void displayDetails(){
        System.out.println("Id of Teacher: " + id);
        System.out.println("Name of Teacher: " + name);
        System.out.println("faculty of Teacher: " + faculty);
        System.out.println("salary of Teacher: " + salary);
    }

}
