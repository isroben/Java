class computeArea{
    
    void area(Double base, Double height){
        Double area = 1/2* (base * height);
        System.out.println("Area of Triangle is: " + area);
    }
    void area(Double radius){
        Double area = 3.14 * (radius * radius);
        System.out.println("Area of Circle is: " + area);

    }
}

public class Q4{
    public static void main(String[] args){
        computeArea a = new computeArea();

        a.area(10.1, 5.2);
        a.area(7.5);
    }
}