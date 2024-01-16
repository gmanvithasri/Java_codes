import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose a shape to print:");
        System.out.println("1. Right-angled triangle");
        System.out.println("2. Square");
        System.out.println("3. Inverted triangle");
        System.out.print("Enter your choice (1-3): ");
        int choice = scanner.nextInt();

        System.out.print("Enter the size of the shape: ");
        int size = scanner.nextInt();

        switch (choice) {
            case 1:
                printRightAngledTriangle(size);
                break;
            case 2:
                printSquare(size);
                break;
            case 3:
                printInvertedTriangle(size);
                break;
            default:
                System.out.println("Invalid choice. Please enter a number between 1 and 3.");
                break;
        }
    }

    private static void printRightAngledTriangle(int size) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    private static void printSquare(int size) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    private static void printInvertedTriangle(int size) {
        for (int i = 0; i < size; i++) {
            for (int j = i; j < size; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
