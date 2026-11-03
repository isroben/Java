class Box{
    private double width;
    private double height;
    private double depth;

    Box(double w, double h, double d){
        this.width = w;
        this.height = h;
        this.depth = d;
    }

    void findVol(){
        double vol = width * height * depth;
        System.out.println("Volume of Box is: " + vol);
    }

    void findSurfaceArea(){
        double area = 2 * ((width*height) + (height*depth) + (depth*width));
        System.out.println("Surcace area of Box is: " + area);
    }
}

public class Q5{
    public static void main(String[] args){
        double width = 10;
        double height = 7;
        double depth = 3;

        Box b = new Box(width, height, depth);

        b.findVol();
        b.findSurfaceArea();
    }
}