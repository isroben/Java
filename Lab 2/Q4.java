import java.util.Scanner;

public class Q4{
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    Double DS = sc.nextDouble();
    Double Java = sc.nextDouble();
    Double Maths = sc.nextDouble();
    Double MP = sc.nextDouble();
    Double UI = sc.nextDouble();

    Double Total = DS + Java + Maths + MP + UI;

    Double Avg = (Total)/5.0;

    System.out.println("The total marks is: " + Total);
    System.out.println("The Avg marks is: " + Avg);

}
}