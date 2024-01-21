import java.util.Scanner;

public class SumOfNaturalNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        int sumByLoop = sumUsingLoop(number);
        int sumByFormula = sumUsingFormula(number);

        System.out.println("Sum of natural numbers up to " + number + " using loop: " + sumByLoop);
        System.out.println("Sum of natural numbers up to " + number + " using formula: " + sumByFormula);
    }

    private static int sumUsingLoop(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    private static int sumUsingFormula(int n) {
        return n * (n + 1) / 2;
    }
}
