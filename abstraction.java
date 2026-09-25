// Abstract Superclass
abstract class BankAccount {
    String accountHolder;
    double balance;

    // Constructor in abstract class
    BankAccount(String accountHolder, double balance) {
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    // Abstract method (no body - must be overridden by subclasses)
    abstract void calculateInterest();

    // Concrete method (regular method with body)
    void displayBalance() {
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: $" + balance);
    }
}

// Concrete Subclass 1
class SavingsAccount extends BankAccount {
    double interestRate = 0.05; // 5% interest

    SavingsAccount(String accountHolder, double balance) {
        super(accountHolder, balance);
    }

    // Overriding abstract method
    @Override
    void calculateInterest() {
        double interest = balance * interestRate;
        System.out.println("Savings Interest (5%): $" + interest);
    }
}

// Concrete Subclass 2
class CurrentAccount extends BankAccount {
    double interestRate = 0.01; // 1% interest

    CurrentAccount(String accountHolder, double balance) {
        super(accountHolder, balance);
    }

    // Overriding abstract method
    @Override
    void calculateInterest() {
        double interest = balance * interestRate;
        System.out.println("Current Account Interest (1%): $" + interest);
    }
}

// Main Class
public class abstraction {
    public static void main(String[] args) {
        // Abstract class reference holding subclass objects
        BankAccount sa = new SavingsAccount("Alice", 10000.0);
        BankAccount ca = new CurrentAccount("Bob", 20000.0);

        System.out.println("--- Savings Account ---");
        sa.displayBalance();
        sa.calculateInterest();

        System.out.println("\n--- Current Account ---");
        ca.displayBalance();
        ca.calculateInterest();
    }
}