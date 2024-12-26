import java.util.Scanner;

public class UnitConverter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- Unit Converter ---");
            System.out.println("1. Length Conversion");
            System.out.println("2. Weight Conversion");
            System.out.println("3. Temperature Conversion");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    lengthConversion(scanner);
                    break;
                case 2:
                    weightConversion(scanner);
                    break;
                case 3:
                    temperatureConversion(scanner);
                    break;
                case 4:
                    System.out.println("Exiting the Unit Converter. Goodbye!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }

    // Length Conversion
    private static void lengthConversion(Scanner scanner) {
        System.out.println("\n--- Length Conversion ---");
        System.out.println("1. Meters to Kilometers");
        System.out.println("2. Kilometers to Meters");
        System.out.println("3. Meters to Miles");
        System.out.println("4. Miles to Meters");
        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();

        System.out.print("Enter the value: ");
        double value = scanner.nextDouble();
        double convertedValue = 0;

        switch (choice) {
            case 1:
                convertedValue = value / 1000;
                System.out.printf("%.2f meters = %.2f kilometers\n", value, convertedValue);
                break;
            case 2:
                convertedValue = value * 1000;
                System.out.printf("%.2f kilometers = %.2f meters\n", value, convertedValue);
                break;
            case 3:
                convertedValue = value * 0.000621371;
                System.out.printf("%.2f meters = %.2f miles\n", value, convertedValue);
                break;
            case 4:
                convertedValue = value / 0.000621371;
                System.out.printf("%.2f miles = %.2f meters\n", value, convertedValue);
                break;
            default:
                System.out.println("Invalid choice for length conversion!");
        }
    }

    // Weight Conversion
    private static void weightConversion(Scanner scanner) {
        System.out.println("\n--- Weight Conversion ---");
        System.out.println("1. Kilograms to Pounds");
        System.out.println("2. Pounds to Kilograms");
        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();

        System.out.print("Enter the value: ");
        double value = scanner.nextDouble();
        double convertedValue = 0;

        switch (choice) {
            case 1:
                convertedValue = value * 2.20462;
                System.out.printf("%.2f kilograms = %.2f pounds\n", value, convertedValue);
                break;
            case 2:
                convertedValue = value / 2.20462;
                System.out.printf("%.2f pounds = %.2f kilograms\n", value, convertedValue);
                break;
            default:
                System.out.println("Invalid choice for weight conversion!");
        }
    }

    // Temperature Conversion
    private static void temperatureConversion(Scanner scanner) {
        System.out.println("\n--- Temperature Conversion ---");
        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Fahrenheit to Celsius");
        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();

        System.out.print("Enter the value: ");
        double value = scanner.nextDouble();
        double convertedValue = 0;

        switch (choice) {
            case 1:
                convertedValue = (value * 9 / 5) + 32;
                System.out.printf("%.2f Celsius = %.2f Fahrenheit\n", value, convertedValue);
                break;
            case 2:
                convertedValue = (value - 32) * 5 / 9;
                System.out.printf("%.2f Fahrenheit = %.2f Celsius\n", value, convertedValue);
                break;
            default:
                System.out.println("Invalid choice for temperature conversion!");
        }
    }
}
