import java.util.Scanner;

public class StringReverser {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String originalString = scanner.nextLine();

        String reversedString = new StringBuilder(originalString).reverse().toString();
        System.out.println("Reversed string: " + reversedString);
    }
}
