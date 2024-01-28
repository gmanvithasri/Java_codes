import java.util.Scanner;

public class ReplaceSpaces {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        System.out.print("Enter the character to replace spaces with: ");
        char replacementChar = scanner.next().charAt(0);

        String replacedString = inputString.replace(' ', replacementChar);
        System.out.println("String after replacing spaces: " + replacedString);
    }
}
