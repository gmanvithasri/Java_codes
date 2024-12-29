import java.util.Scanner;

public class UnitConverter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nWelcome to Unit Converter!");
            System.out.println("1. Length Conversion");
            System.out.println("2. Weight Conversion");
            System.out.println("3. Temperature Conversion");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");

            choice = scanner.nextInt();

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
                    System.out.println("Exiting Unit Converter. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 4);

        scanner.close();
    }

    private static void lengthConversion(Scanner scanner) {
        System.out.println("\nLength Conversion:");
        System.out.println("1. Meters to Kilometers");
        System.out.println("2. Kilometers to Meters");
        System.out.println("3. Miles to Kilometers");
        System.out.println("4. Kilometers to Miles");
        System.out.print("Choose an option: ");
        int option = scanner.nextInt();

        System.out.print("Enter the value: ");
        double value = scanner.nextDouble();
        double result;

        switch (option) {
            case 1:
                result = value / 1000;
                System.out.println(value + " meters = " + result + " kilometers");
                break;
            case 2:
                result = value * 1000;
                System.out.println(value + " kilometers = " + result + " meters");
                break;
            case 3:
                result = value * 1.60934;
                System.out.println(value + " miles = " + result + " kilometers");
                break;
            case 4:
                result = value / 1.60934;
                System.out.println(value + " kilometers = " + result + " miles");
                break;
            default:
                System.out.println("Invalid option.");
        }
    }

    private static void weightConversion(Scanner scanner) {
        System.out.println("\nWeight Conversion:");
        System.out.println("1. Kilograms to Pounds");
        System.out.println("2. Pounds to Kilograms");
        System.out.print("Choose an option: ");
        int option = scanner.nextInt();

        System.out.print("Enter the value: ");
        double value = scanner.nextDouble();
        double result;

        switch (option) {
            case 1:
                result = value * 2.20462;
                System.out.println(value + " kilograms = " + result + " pounds");
                break;
            case 2:
                result = value / 2.20462;
                System.out.println(value + " pounds = " + result + " kilograms");
                break;
            default:
                System.out.println("Invalid option.");
        }
    }

    private static void temperatureConversion(Scanner scanner) {
        System.out.println("\nTemperature Conversion:");
        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Fahrenheit to Celsius");
        System.out.print("Choose an option: ");
        int option = scanner.nextInt();

        System.out.print("Enter the value: ");
        double value = scanner.nextDouble();
        double result;

        switch (option) {
            case 1:
                result = (value * 9 / 5) + 32;
                System.out.println(value + " Celsius = " + result + " Fahrenheit");
                break;
            case 2:
                result = (value - 32) * 5 / 9;
                System.out.println(value + " Fahrenheit = " + result + " Celsius");
                break;
            default:
                System.out.println("Invalid option.");
        }
    }
}
