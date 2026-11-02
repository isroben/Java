import java.util.Scanner;

public class Q2{
    public static void main(String[] args0){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a Number: ");
        int num = sc.nextInt();

        if(num == 0){
            System.out.println("Invalid Input!");
        }
        else if(num > 0){
            System.out.println("Number is Positive.");
        }
        else{
            System.out.println("Number is Negative.");
        }
    }
}