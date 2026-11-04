/*
 * Example: Payment System
 *
 * Real-world Scenario:
 * An online shopping application supports different
 * payment methods such as Credit Card, eSewa and Khalti.
 *
 * Abstract Class:
 * Payment is the parent abstract class.
 *
 * Abstract Method:
 * pay() defines a common payment operation.
 *
 * Child Classes:
 * CreditCard, Esewa and Khalti implement their own
 * versions of the pay() method.
 *
 * Concept Demonstrated:
 * Abstraction, Inheritance, Method Overriding
 * and Runtime Polymorphism.
 */

abstract class Payment{

    abstract void pay();
}

class CreditCard extends Payment{
    void pay(){
        System.out.println("Payment successful through credit card.");
    }
}

class Fonepay extends Payment{
    void pay(){
        System.out.println("Payment successful through esewa.");
    }
}

class Cash extends Payment{
    void pay(){
        System.out.println("Payment successful through Cash.");
    }
}

public class Q6{
    public static void main(String[] args){
        Payment p;

        p = new CreditCard();
        p.pay();

        p = new Fonepay();
        p.pay();

        p = new Cash();
        p.pay();
    }
}