import java.util.Scanner;

public class ToggleCase {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        String toggledString = toggleCase(inputString);
        System.out.println("String after toggling case: " + toggledString);
    }

    private static String toggleCase(String str) {
        StringBuilder toggled = new StringBuilder();

        for (char ch : str.toCharArray()) {
            if (Character.isLowerCase(ch)) {
                toggled.append(Character.toUpperCase(ch));
            } else if (Character.isUpperCase(ch)) {
                toggled.append(Character.toLowerCase(ch));
            } else {
                toggled.append(ch); // Append the character as it is if it's not a letter
            }
        }

        return toggled.toString();
    }
}
