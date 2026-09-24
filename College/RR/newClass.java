package College.RR; 

// 2. IMPORT the classes from their respective packages

public class newClass{
    public static void main(String[] args){
        Student s = new Student(12, "Raj", "BCA", "2nd");
        Teacher t = new Teacher(25, "Harish", "BCA", 70000.00);

        s.displayDetails();
        t.displayDetails();
    }
    
}