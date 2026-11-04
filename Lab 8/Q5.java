class Shape{
    void area(){
        System.out.println("Tha area of shape: ");
    }
}

class Triangle extends Shape{
    Double base;
    Double height;

    Triangle(Double b, Double h){
        this.base = b;
        this.height = h;
    }
    @Override
    void area(){
        System.out.println("The area of Triangle is: " + ((base * height)/2));
    }
}


class Rectangle extends Shape{
    Double base;
    Double height;

    Rectangle(Double base, Double height){
        this.base = base;
        this.height = height;
    }

    @Override
    void area(){
        System.out.println("The area  of reactange is: " + (base * height));
    }
}

public class Q5{
    public static void main(String[] args){
        Shape s;

        s  = new Triangle(3.0, 4.0);
        s.area();

        s = new Rectangle(3.0, 4.0);
        s.area();
    }
}