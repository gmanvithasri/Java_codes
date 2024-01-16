import java.util.Scanner;

public class NumberToWordConverter {
    private static final String[] units = {
        "", "One", "Two", "Three", "Four",
        "Five", "Six", "Seven", "Eight", "Nine", "Ten","Eleven", "Twelve", "Thirteen", "Fourteen",
"Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"
};
  private static final String[] tens = {
    "",        // 0
    "",        // 1
    "Twenty",  // 2
    "Thirty",  // 3
    "Forty",   // 4
    "Fifty",   // 5
    "Sixty",   // 6
    "Seventy", // 7
    "Eighty",  // 8
    "Ninety"   // 9
};

public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter a number (up to 9999) to convert to words: ");
    int number = scanner.nextInt();

    if (number < 0 || number > 9999) {
        System.out.println("Number out of range.");
    } else {
        System.out.println("Number in words: " + convert(number));
    }
}

private static String convert(final int number) {
    if (number < 20) {
        return units[number];
    } else if (number < 100) {
        return tens[number / 10] + ((number % 10 != 0) ? " " + units[number % 10] : "");
    } else if (number < 1000) {
        return units[number / 100] + " Hundred" + ((number % 100 != 0) ? " " + convert(number % 100) : "");
    } else {
        return units[number / 1000] + " Thousand" + ((number % 1000 != 0) ? " " + convert(number % 1000) : "");
    }
}
}
