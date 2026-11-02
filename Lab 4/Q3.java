import java.util.Scanner;

public class Q3{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int newNum = 0;

        int temp = num;

        for(int i=0; temp>0 ; i++){
            newNum += (temp % 10) * (10) (3-i);
            temp /= 10;
        }

        System.out.println(newNum);
    }
}