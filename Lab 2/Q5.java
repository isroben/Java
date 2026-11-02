import java.util.Scanner;

public class Q5{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("Bitwise XOR: " + (a^b));
        System.out.println("Bitwise OR: " + (a|b));
        System.out.println("Bitwise AND: " + (a&b));
        System.out.println("Bitwise Comp: " + (~a));
    }
}