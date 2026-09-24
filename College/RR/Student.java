package College.RR;

public class Student {
    private int roll;
    private String name;
    private String program;
    private String semester;

    public Student(int roll, String name, String program, String semester){
        this.roll = roll;
        this.name = name;
        this.program = program;
        this.semester = semester;
    }

    public void displayDetails(){
        System.out.println("Roll no of Student: " + roll);
        System.out.println("Name of Student: " + name);
        System.out.println("Program of Student: " + program);
        System.out.println("semester of Student: " + semester);
    }

    
}
