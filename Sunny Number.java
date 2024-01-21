import java.util.Scanner;

public class SunnyNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to check if it is a Sunny number: ");
        int number = scanner.nextInt();

        if (isSunny(number)) {
            System.out.println(number + " is a Sunny number.");
        } else {
            System.out.println(number + " is not a Sunny number.");
        }
    }

    private static boolean isSunny(int number) {
        int nextNumber = number + 1;
        double squareRoot = Math.sqrt(nextNumber);

        return (int) squareRoot * (int) squareRoot == nextNumber;
    }
}
