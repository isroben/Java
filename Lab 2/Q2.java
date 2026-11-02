public class Q2{
    public static void main(String[] args){
        int a = 10;
        int b = 3;


        // Swapping without third variable
        a += b;
        b = a - b;
        a = a - b;

        System.out.println("a : " + a);
        System.out.println("b : " + b);


        // Swapping with third variable
        int p = 10;
        int q = 3;
        int temp = 0;

        temp = p;
        p = q;
        q = temp;

        System.out.println("p : " + p);
        System.out.println("q : " + q);

        
    }
}