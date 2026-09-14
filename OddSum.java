public class OddSum{
    public static void main(String [] args){
        long sum = 0;

        for(int i=0; i<50; i++){
            if(i%2==0){
                continue;
            }
            sum += i;
        }

        System.out.println("The sum of Odd Num from 1 to 50: " + sum);
    }
}