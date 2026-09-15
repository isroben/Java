import java.util.Scanner;
class Box{
    private double width;
    private double height;
    private double depth;

    Box(double width, double height, double depth){
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    double volume(){
        return width*height*depth;
    }
    double surfaceArea(){
        return 2*(width*height + width*depth + height*depth);
    }
}

public class BoxClass{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        Double w = sc.nextDouble();
        Double h = sc.nextDouble();
        Double d = sc.nextDouble();

        Box b1 = new Box(w, h, d);

        System.out.println("The Vol of Box is: "+ b1.volume());


    }
}