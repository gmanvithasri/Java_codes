import java.util.Scanner;

public class AutomorphicNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to check if it is an automorphic number: ");
        int number = scanner.nextInt();

        if (isAutomorphic(number)) {
            System.out.println(number + " is an automorphic number.");
        } else {
            System.out.println(number + " is not an automorphic number.");
        }
    }

    private static boolean isAutomorphic(int number) {
        int square = number * number;
        
        while (number > 0) {
            if (number % 10 != square % 10) {
                return false;
            }
            number /= 10;
            square /= 10;
        }
        return true;
    }
}
