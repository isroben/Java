public class Q1{
    public static void main(String[] args){
        Integer num = Integer.parseInt(args[0]);
        Integer sum = 0;

        while(num > 0){
            sum += num % 10;
            num /= 10;
        }

        System.out.println("The sum of individual digits is: " + sum);
    }
}