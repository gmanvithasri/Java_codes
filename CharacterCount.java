import java.util.Scanner;

public class CharacterCount {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        int characterCount = inputString.length();
        System.out.println("The total number of characters in the string is: " + characterCount);
    }
}
