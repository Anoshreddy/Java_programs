import java.util.Scanner;

public class SimpleATM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int balance = 1000;
        int choice;

        while (true) {
            System.out.println("ATM Menu:");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Your balance is: " + balance);
                    break;
                case 2:
                    System.out.print("Enter the amount to deposit: ");
                    int deposit = scanner.nextInt();
                    balance += deposit;
                    System.out.println("You have successfully deposited " + deposit);
                    break;
                case 3:
                    System.out.print("Enter the amount to withdraw: ");
                    int withdraw = scanner.nextInt();
                    if (withdraw <= 0) {
                        System.out.println("Invalid amount. Please enter a positive number.");
                    } else if (withdraw > balance) {
                        System.out.println("Insufficient funds.");
                    } else {
                        balance -= withdraw;
                        System.out.println("You have successfully withdrawn " + withdraw);
                    }
                    break;
                case 4:
                    System.out.println("Thank you for using the ATM. Goodbye!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }

            System.out.println();
        }
    }
}
