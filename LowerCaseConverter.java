import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        String lowerCaseString = inputString.toLowerCase();
        System.out.println("Lowercase version: " + lowerCaseString);

        scanner.close();
    }
}
