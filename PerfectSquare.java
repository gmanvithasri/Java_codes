import java.util.Scanner;

public class PerfectSquare {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to check if it's a perfect square: ");
        long number = scanner.nextLong();

        if (isPerfectSquare(number)) {
            System.out.println(number + " is a perfect square.");
        } else {
            System.out.println(number + " is not a perfect square.");
        }
    }

    private static boolean isPerfectSquare(long number) {
        if (number < 0) {
            return false; // Negative numbers cannot be perfect squares
        }

        long sqrt = (long) Math.sqrt(number);
        return sqrt * sqrt == number;
    }
}
