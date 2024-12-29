import java.util.HashMap;
import java.util.Scanner;

public class CurrencyConverter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Exchange rates: base currency is USD
        HashMap<String, Double> rates = new HashMap<>();
        rates.put("USD", 1.0); // Base currency
        rates.put("EUR", 0.85);
        rates.put("GBP", 0.75);
        rates.put("INR", 73.5);
        rates.put("JPY", 110.0);
        rates.put("AUD", 1.35);
        rates.put("CAD", 1.25);

        System.out.println("Welcome to the Currency Converter!");

        // Display available currencies
        System.out.println("Available currencies:");
        for (String currency : rates.keySet()) {
            System.out.println("- " + currency);
        }

        System.out.print("\nEnter the source currency (e.g., USD): ");
        String sourceCurrency = scanner.next().toUpperCase();

        if (!rates.containsKey(sourceCurrency)) {
            System.out.println("Invalid source currency. Exiting program.");
            return;
        }

        System.out.print("Enter the target currency (e.g., EUR): ");
        String targetCurrency = scanner.next().toUpperCase();

        if (!rates.containsKey(targetCurrency)) {
            System.out.println("Invalid target currency. Exiting program.");
            return;
        }

        System.out.print("Enter the amount to convert: ");
        double amount = scanner.nextDouble();

        // Conversion logic
        double sourceToUSD = amount / rates.get(sourceCurrency);
        double convertedAmount = sourceToUSD * rates.get(targetCurrency);

        System.out.printf("%.2f %s = %.2f %s\n", amount, sourceCurrency, convertedAmount, targetCurrency);

        System.out.println("Thank you for using the Currency Converter!");
        scanner.close();
    }
}
