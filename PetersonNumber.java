import java.util.Scanner;

public class PetersonNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to check if it is a Peterson number: ");
        int number = scanner.nextInt();

        if (isPeterson(number)) {
            System.out.println(number + " is a Peterson number.");
        } else {
            System.out.println(number + " is not a Peterson number.");
        }
    }

    private static boolean isPeterson(int number) {
        int originalNumber = number;
        int sum = 0;

        while (number > 0) {
            int digit = number % 10;
            sum += factorial(digit);
            number /= 10;
        }

        return sum == originalNumber;
    }

    private static int factorial(int n) {
        int fact = 1;
        for (int i = 2; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }
}
