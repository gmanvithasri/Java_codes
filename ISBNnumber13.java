import java.util.Scanner;

public class ISBNnumber13 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an ISBN-13 number to check: ");
        String isbn = scanner.nextLine();

        if (isValidISBN13(isbn)) {
            System.out.println(isbn + " is a valid ISBN-13 number.");
        } else {
            System.out.println(isbn + " is not a valid ISBN-13 number.");
        }
    }

    private static boolean isValidISBN13(String isbn) {
        if (isbn == null || isbn.length() != 13 || !isbn.matches("\\d+")) {
            return false;
        }

        int sum = 0;
        for (int i = 0; i < 12; i++) {
            int digit = isbn.charAt(i) - '0';
            sum += (i % 2 == 0) ? digit : digit * 3;
        }

        int checksumDigit = (10 - (sum % 10)) % 10;
        return checksumDigit == isbn.charAt(12) - '0';
    }
}
