import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the minimum range value: ");
        int min = scanner.nextInt();

        System.out.print("Enter the maximum range value: ");
        int max = scanner.nextInt();

        Random random = new Random();

        int randomNumber;
        if (max > min) {
            randomNumber = random.nextInt(max - min + 1) + min;
        } else {
            System.out.println("Invalid range. Maximum should be greater than minimum.");
            return;
        }

        System.out.println("Random number (between " + min + " and " + max + "): " + randomNumber);
    }
}
