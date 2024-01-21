import java.util.Scanner;

public class nthPrimeNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter n to find the nth prime number: ");
        int n = scanner.nextInt();

        int primeNumber = findNthPrime(n);
        System.out.println("The " + n + "th prime number is: " + primeNumber);
    }

    private static int findNthPrime(int n) {
        int number, count = 0;

        for (number = 2; count < n; ++number) {
            if (isPrime(number)) {
                count++;
            }
        }

        return number - 1;
    }

    private static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }
}
