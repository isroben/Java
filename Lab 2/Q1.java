public class Q1{
    public static void main(String[] args){
        float a = 9;
        float b = 13;
        float c = 3;

        float x = a - b / c * 2 - 1;
        float y = a - (float)b / (3 + c) * (2 - 1);
        float z = a - ((float)b / (3 + c) * 2) - 1;

        System.out.println("The value of x is: " + x);
        System.out.println("The value of y is: " + y);
        System.out.println("The value of z is: " + z);
    }
}