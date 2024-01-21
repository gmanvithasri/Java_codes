import java.util.Scanner;

public class TechNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to check if it is a Tech number: ");
        int number = scanner.nextInt();

        if (isTechNumber(number)) {
            System.out.println(number + " is a Tech number.");
        } else {
            System.out.println(number + " is not a Tech number.");
        }
    }

    private static boolean isTechNumber(int number) {
        String numStr = Integer.toString(number);
        int numDigits = numStr.length();

        if (numDigits % 2 != 0) {
            return false;
        }

        int mid = numDigits / 2;
        int firstHalf = Integer.parseInt(numStr.substring(0, mid));
        int secondHalf = Integer.parseInt(numStr.substring(mid));

        return (firstHalf + secondHalf) * (firstHalf + secondHalf) == number;
    }
}
