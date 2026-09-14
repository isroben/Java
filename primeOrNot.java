import java.util.Scanner;

public class primeOrNot{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        int i = 2;
        boolean prime = true;

        if(num <= 1){
            prime = false;
        }
        else{
            while(i<num){
                if(num % i == 0){
                    prime = false;
                    break;
                }
                i++;

            }
        }
        if (prime) {
            System.out.println(num + " is a Prime number.");
        } else {
            System.out.println(num + " is not a Prime number.");
        }
    }
}