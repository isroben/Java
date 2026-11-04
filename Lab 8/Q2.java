import java.util.Scanner;

class Add{
    int a;
    int b;

    Add(int a, int b){
        this.a = a;
        this.b = b;
    }

    void add(){
        System.out.println("The ratio of two num: " + (a+b));
    }
}

class Sub extends Add{
    Sub(int a, int b){
        super(a, b);
    }

    void sub(){
        System.out.println("The ratio of two num: " + (a-b));
    }
}

class Mul extends Sub{
    Mul(int a, int b){
        super(a, b);
    }

    void mul(){
        System.out.println("The ratio of two num: " + (a*b));
    }
}

class Div extends Mul{
    Div(int a, int b){
        super(a, b);
    }
    void div(){
        System.out.println("The ratio of two num: " + (a/b));
    }
}

public class Q2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int a, b;
        System.out.println("Enter two operands: ");
        a = sc.nextInt();
        b = sc.nextInt();

        Div calc = new Div(a, b);

        calc.add();
        calc.sub();
        calc.mul();
        calc.div();

    }
}