public class Q3{
    public static int Fibonacci(int n){
        if(n == 0 || n == 1){
            return n;
        }
        return Fibonacci(n-1) + Fibonacci(n-2);
    }

    public static void main(String[] args){
        int n = 7;

        System.out.println("The sequence is: ");
        for(int i=0; i<n; i++){
            System.out.printf(Fibonacci(i) + " ");
        }
    }
}