class Circle{
    private double radius;

    Circle(){};
    Circle(double r){
        this.radius = r;
    }

    void findArea(){
        double area = (double)3.14 * (radius * radius);
        System.out.println("\nArea of Circle: " + area);
    }

    void findCricumference(){
        double c = 2 * (3.14 * radius);
            System.out.println("\nCircumference of Circle: " + c);
;
    }
}

public class Q4{
    public static void main(String[] args){
        double radius = 3;

        Circle c = new Circle(radius);

        c.findArea();
        c.findCricumference();
    }
}