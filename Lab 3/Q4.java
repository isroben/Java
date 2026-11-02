import java.util.Scanner;

public class Q4{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        if(num % 2 == 0){
            if(num % 3 == 0){
                System.out.println("The number is Even and Divisible by 3.");
            }
            else{
                System.out.println("The number is Even and but not Divisible by 3.");
            }
        }
        else{
            if(num % 3 == 0){
                System.out.println("The number is Odd and Divisible by 3.");
            }
            else{
                System.out.println("The number is Odd and but not Divisible by 3.");
                
            }
        }
    }
}