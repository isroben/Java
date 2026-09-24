
class Distance{
    private int feet;
    private int inches;

    public Distance(){
        this.feet = 0;
        this.inches = 0;
    }

    public Distance(int feet, int inches){
        this.feet = feet;
        this.inches = inches;
    }

    public void addDistance(Distance d){
        this.feet += d.feet;
        this.inches += d.inches;
    }

    public void displayDistance(){
        System.out.println(feet + " feet, " + inches + " inches");
    }
}

public class MyDistance{
    public static void main(String[] args){
        Distance d1 = new Distance(3, 7);
        Distance d2 = new Distance(8, 2);

        System.out.println("Distance 1: ");
        d1.displayDistance();

        System.out.println("Distance 2: ");
        d2.displayDistance();

        
        d1.addDistance(d2);
        System.out.println("New Distance: ");
        d1.displayDistance();
        }
}