import java.util.Scanner;
public class Q3{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Integer a = sc.nextInt();
        Integer b = sc.nextInt();
        Integer c = sc.nextInt();

        Integer largest = 0;
        Integer smallest = 0;

        largest = (a > b && a > c) ? a : ((b >= c) ? b : c);
        smallest = (a < b && a < c) ? a : ((b < c) ? b : c);

        System.out.println("The smallest Number is: " + smallest);
        System.out.println("The Largest Number is: " + largest);
    }
}