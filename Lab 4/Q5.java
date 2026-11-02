public class Q5{
    public static void main(String[] args){
        int sum = 0;

        for(int i=0; i<50; i++){
            if(i % 2 == 0){
                continue;
            }
                sum += i;
        }

        System.out.println("The sum is: " + sum);
    }
}