import java.util.Scanner;

public class Q2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int count = 0;

        for(int i=2; i<=(num/2); i++){
            if(num % i == 0){
                count++;
            }
        }

        if(count > 1){
            System.out.println("The number is not prime.");
        }
        else{
            System.out.println("The number is a prime.");

        }
    }
}