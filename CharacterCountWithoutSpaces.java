import java.util.Scanner;

public class CharacterCountWithoutSpaces {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        int characterCount = countNonWhitespaceCharacters(inputString);
        System.out.println("The total number of characters (excluding spaces) in the string is: " + characterCount);
    }

    private static int countNonWhitespaceCharacters(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (!Character.isWhitespace(str.charAt(i))) {
                count++;
            }
        }
        return count;
    }
}
