import java.util.Scanner;

class Circle{
    private float radius;

    Circle(){
        radius = 1.0f;
    }
    Circle(float radius){
        this.radius = radius;
    }

    float findArea(){
        return 22/7 * (radius * radius);
    }

    float findCircumference(){
        return 2 * (22/7) * radius;
    }

}

public class CircleClass{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Float f = sc.nextFloat();

        Circle c1 = new Circle(f);

        System.out.println("The area is: " + c1.findArea());

    }
}
