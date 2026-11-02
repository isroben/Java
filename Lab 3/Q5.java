import java.util.Scanner;

public class Q5{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter two Operand and a Operator(Sign): ");
        

        int a = sc.nextInt();
        int b = sc.nextInt();

        char c = sc.next().charAt(0);

        if(c == '+'){
            System.out.println("Addition b/w a and b: "+ (a + b));
        }
        else if(c == '-'){
            System.out.println("Difference b/w a and b: "+ (a - b));
        }
        else if(c == '*'){
            System.out.println("Product of a and b: "+ (a * b));
        }
        else if(c == '/'){
            System.out.println("Ratio of a and b: "+ (a / b));
        }
        else if(c == '%'){
            System.out.println("Modulo of a and b: "+ (a % b));
        }
        else{
            System.out.println("Invalid Operator!");  
        }

        
    }
}