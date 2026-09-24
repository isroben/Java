public class VarargsDemo {
    public static int calculateSum(int... numbers){
        int sum = 0;

        for(int num: numbers){
            sum += num;
        }
        return sum;
    }

    public static void main(String[] args){
        int sum1 = calculateSum(10, 20);
        int sum2 = calculateSum(5, 10, 15, 20);
        int sum3 = calculateSum(100, 200, 300, 400, 500);

        System.out.println("Sum of 2 numbers: "+ sum1);
        System.out.println("Sum of 4 numbers: "+ sum2);
        System.out.println("Sum of 5 numbers: "+ sum3);
    }
}
