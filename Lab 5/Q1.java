import java.util.Scanner;

public class Q1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of array: ");

        int n = sc.nextInt();
        int[] arr = new int[n];
        int sum = 0;

        System.out.println("Enter the elements of array: ");

        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        for(int i : arr){
            sum += i;
        }

        System.out.println("The sum of array element is: "+ sum);
    }
}