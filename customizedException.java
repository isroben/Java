import java.util.Scanner;

// Custom Exception Class
class InvalidPhoneNumberException extends Exception {
    public InvalidPhoneNumberException(String message) {
        super(message);
    }
}

public class customizedException {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter your phone number: ");
            String phoneNumber = scanner.next();

            // Check if phone number length is not equal to 10
            if (phoneNumber.length() != 10) {
                throw new InvalidPhoneNumberException("Invalid phone number");
            }

            System.out.println("Phone number registered successfully: " + phoneNumber);

        } catch (InvalidPhoneNumberException e) {
            // Catching custom exception and printing the required message
            System.out.println("Exception Caught: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}