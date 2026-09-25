import java.util.Scanner;

// Custom exception class for insufficient funds
class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String message) {
        super(message);
    }
}

public class Q2L9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Reading balance and withdraw amount from keyboard
            System.out.print("Enter current balance: ");
            double balance = scanner.nextDouble();

            System.out.print("Enter withdraw amount: ");
            double withdrawAmount = scanner.nextDouble();

            // Check if withdrawal is possible
            if (withdrawAmount > balance) {
                // Throwing custom exception with appropriate message
                throw new InsufficientBalanceException("Transaction Failed: Insufficient balance in your account!");
            }

            // Calculating and displaying remaining balance
            balance -= withdrawAmount;
            System.out.println("Withdrawal successful!");
            System.out.println("Remaining Balance: $" + balance);

        } catch (InsufficientBalanceException e) {
            // Catching custom user-defined exception
            System.out.println("Exception Caught: " + e.getMessage());
        } catch (Exception e) {
            // Catching input format errors (e.g., entering letters instead of numbers)
            System.out.println("Invalid input entered. Please enter numeric values.");
        } finally {
            scanner.close();
        }
    }
}