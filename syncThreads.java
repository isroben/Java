// Shared resource class
class BankAccount {
    private int balance = 1000;

    // Synchronized method to prevent concurrent access issues
    public synchronized void withdraw(String threadName, int amount) {
        System.out.println(threadName + " is trying to withdraw $" + amount);

        if (balance >= amount) {
            System.out.println(threadName + " verified sufficient balance.");

            // Simulating processing delay
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }

            balance -= amount;
            System.out.println(threadName + " successfully withdrew $" + amount);
            System.out.println("Remaining Balance: $" + balance + "\n");
        } else {
            System.out.println(threadName + " failed to withdraw. Insufficient balance!");
            System.out.println("Current Balance: $" + balance + "\n");
        }
    }
}

// Thread class
class CustomerThread extends Thread {
    private BankAccount account;
    private int withdrawAmount;

    CustomerThread(String name, BankAccount account, int withdrawAmount) {
        super(name); // Setting thread name
        this.account = account;
        this.withdrawAmount = withdrawAmount;
    }

    @Override
    public void run() {
        // Calling the synchronized method
        account.withdraw(getName(), withdrawAmount);
    }
}

// Main Class
public class syncThread {
    public static void main(String[] args) {
        // Single shared object
        BankAccount sharedAccount = new BankAccount();

        // Creating two threads trying to withdraw from the SAME account
        CustomerThread t1 = new CustomerThread("User-1 (Alice)", sharedAccount, 700);
        CustomerThread t2 = new CustomerThread("User-2 (Bob)", sharedAccount, 500);

        System.out.println("--- Synchronization Demo ---");
        System.out.println("Initial Balance: $1000\n");

        // Starting both threads concurrently
        t1.start();
        t2.start();
    }
}