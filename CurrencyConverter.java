import java.util.Scanner;

public class CurrencyConverter {

    public static void main(String[] args) {
        // Predefined exchange rates (e.g., 1 USD to other currencies)
        final double USD_TO_EUR = 0.93;
        final double USD_TO_GBP = 0.77;
        final double USD_TO_INR = 83.12;
        final double USD_TO_JPY = 143.35;

        Scanner scanner = new Scanner(System.in);

        System.out.println("--- Currency Converter ---");
        System.out.println("Select the currency to convert from USD:");
        System.out.println("1. EUR (Euro)");
        System.out.println("2. GBP (British Pound)");
        System.out.println("3. INR (Indian Rupee)");
        System.out.println("4. JPY (Japanese Yen)");
        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();

        System.out.print("Enter the amount in USD: ");
        double amountUSD = scanner.nextDouble();

        double convertedAmount = 0;
        String currency = "";

        switch (choice) {
            case 1:
                convertedAmount = amountUSD * USD_TO_EUR;
                currency = "EUR";
                break;
            case 2:
                convertedAmount = amountUSD * USD_TO_GBP;
                currency = "GBP";
                break;
            case 3:
                convertedAmount = amountUSD * USD_TO_INR;
                currency = "INR";
                break;
            case 4:
                convertedAmount = amountUSD * USD_TO_JPY;
                currency = "JPY";
                break;
            default:
                System.out.println("Invalid choice! Please run the program again.");
                scanner.close();
                return;
        }

        System.out.printf("%.2f USD is equal to %.2f %s\n", amountUSD, convertedAmount, currency);

        scanner.close();
    }
}

