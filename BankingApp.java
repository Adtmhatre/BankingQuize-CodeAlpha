
import java.util.Scanner;

public class BankingApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double balance = 0.0;
        int choice;

        System.out.println("Welcome to Banking System");

        do {
            // Display menu options
            System.out.println("\nBanking Menu:");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    // Deposit operation
                    System.out.print("Enter deposit amount: ");
                    double depositAmount = scanner.nextDouble();
                    if (depositAmount > 0) {
                        balance += depositAmount;
                        System.out.println("$" + depositAmount + " deposited successfully.");
                    } else {
                        System.out.println("Invalid amount. Please enter a positive value.");
                    }
                    break;
                
                case 2:
                    // Withdrawal operation
                    System.out.print("Enter withdrawal amount: ");
                    double withdrawAmount = scanner.nextDouble();
                    if (withdrawAmount > 0 && withdrawAmount <= balance) {
                        balance -= withdrawAmount;
                        System.out.println("$" + withdrawAmount + " withdrawn successfully.");
                    } else {
                        System.out.println("Invalid transaction. Check balance or enter a positive amount.");
                    }
                    break;
                
                case 3:
                    // Display balance
                    System.out.println("Your current balance is: $" + balance);
                    break;
                
                case 4:
                    // Exit the program
                    System.out.println("Thank you for using Banking System. Goodbye!");
                    break;
                
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 4.");
            }
        } while (choice != 4);

        scanner.close();
    }
}
