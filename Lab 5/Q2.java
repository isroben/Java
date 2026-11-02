import java.util.Scanner;

public class Q2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of array: ");

        int n = sc.nextInt();
        int[] arr = new int[n];
        int max = arr[0];
        int min = arr[0];

        System.out.println("Enter the elements of array: ");

        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        for(int i=1; i<n; ++i){
            if(max < arr[i]){
                max = arr[i];
            }
            if(min > arr[i]){
                min = arr[i];
            }
        }

        System.out.println("Max: "+ max + "\nMin: " + min);
    }
}