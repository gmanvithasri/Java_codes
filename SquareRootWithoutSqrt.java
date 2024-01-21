import java.util.Scanner;

public class SquareRootWithoutSqrt {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to find its square root: ");
        double number = scanner.nextDouble();

        double squareRoot = findSquareRoot(number);
        System.out.println("The square root of " + number + " is approximately: " + squareRoot);
    }

    private static double findSquareRoot(double number) {
        if (number < 0) {
            return Double.NaN; // Return NaN for negative numbers
        }
        if (number == 0 || number == 1) {
            return number; // Return the number itself if it is 0 or 1
        }

        double epsilon = 1e-10; // Precision
        double guess = number;

        while (Math.abs(guess - number / guess) > epsilon) {
            guess = (guess + number / guess) / 2.0;
        }

        return guess;
    }
}
