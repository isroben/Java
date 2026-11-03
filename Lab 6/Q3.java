import java.util.Scanner;

public class Q3{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        char[] arr = str.toCharArray();

        int st = 0;
        int end = arr.length - 1;

        boolean isPalindrome = true;

        while(st < end){
            if(arr[st] != arr[end]){
                isPalindrome = false;
            }
            st++;
            end--;
        }

        if(isPalindrome){
            System.out.println("String is Palindrome.");
        }
        else {
            System.out.println("String is not Palindrome.");
        }
    }

}