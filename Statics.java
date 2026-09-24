class Employee{
    private static int num = 0;
    private String name;

    public Employee(String name){
        this.name = name;
        num++;
    }

    static int getNum(){
        return num;
    }
}

public class Statics{
    public static void main(String[] args){
        Employee e1 = new Employee("Hrish");
        Employee e2 = new Employee("Hrish");
        Employee e3 = new Employee("Hrish");
        Employee e4 = new Employee("Hrish");

        System.out.println("Total no of employee created: " + Employee.getNum());

    }
}