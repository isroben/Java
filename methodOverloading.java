class Student{
    public double add(int a, int b){
        return a + b;
    }
    
    public double add(double a, double b){
        return a + b;
    }
}

public class methodOverloading{
    public static void main(String[] args){
        Student s = new Student();

        s.add(4.0, 6.0);
    }
}