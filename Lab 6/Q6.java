class Distance{
    private int feet;
    private int inches;

    Distance(){}
    Distance(int f, int i){
        this.feet = f;
        this.inches = i;
    }

    void addDistance(int f, int i){
        this.feet += f;
        this.inches += i;

        if(this.inches >= 12){
            this.feet += this.inches / 12;
            this.inches %= 12;
        }
    }

    void display(){
        System.out.println("Distance: " + feet + " feet " + inches + " inches ");
    }
}

public class Q6{
    public static void main(String[] args){
        Distance d = new Distance(5, 8);

        System.out.println("Original Distance:");
        d.display();


        d.addDistance(3, 9);
        System.out.println("After Adding Distance:");
        d.display();
    }
}