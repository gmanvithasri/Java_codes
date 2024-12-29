import java.util.Scanner;

public class TextFormatter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Text Formatter!");
        System.out.print("Enter the text to be formatted: ");
        String text = scanner.nextLine();

        System.out.println("\nChoose a formatting option:");
        System.out.println("1. Uppercase");
        System.out.println("2. Lowercase");
        System.out.println("3. Title Case");
        System.out.println("4. Justified Alignment");
        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        switch (choice) {
            case 1:
                System.out.println("\nFormatted Text: ");
                System.out.println(text.toUpperCase());
                break;

            case 2:
                System.out.println("\nFormatted Text: ");
                System.out.println(text.toLowerCase());
                break;

            case 3:
                System.out.println("\nFormatted Text: ");
                System.out.println(toTitleCase(text));
                break;

            case 4:
                System.out.print("Enter the line width for justification: ");
                int width = scanner.nextInt();
                System.out.println("\nFormatted Text: ");
                System.out.println(justifyText(text, width));
                break;

            default:
                System.out.println("Invalid choice. Exiting program.");
        }

        scanner.close();
    }

    private static String toTitleCase(String text) {
        String[] words = text.split(" ");
        StringBuilder titleCase = new StringBuilder();

        for (String word : words) {
            if (word.length() > 0) {
                titleCase.append(Character.toUpperCase(word.charAt(0)))
                        .append(word.substring(1).toLowerCase())
                        .append(" ");
            }
        }

        return titleCase.toString().trim();
    }

    private static String justifyText(String text, int width) {
        String[] words = text.split(" ");
        StringBuilder justifiedText = new StringBuilder();
        StringBuilder line = new StringBuilder();

        for (String word : words) {
            if (line.length() + word.length() + 1 > width) {
                justifiedText.append(justifyLine(line.toString().trim(), width)).append("\n");
                line.setLength(0);
            }
            line.append(word).append(" ");
        }

        if (line.length() > 0) {
            justifiedText.append(line.toString().trim());
        }

        return justifiedText.toString();
    }

    private static String justifyLine(String line, int width) {
        String[] words = line.split(" ");
        if (words.length == 1) {
            return line;
        }

        int totalSpaces = width - line.replace(" ", "").length();
        int spaceBetweenWords = totalSpaces / (words.length - 1);
        int extraSpaces = totalSpaces % (words.length - 1);

        StringBuilder justifiedLine = new StringBuilder();

        for (int i = 0; i < words.length - 1; i++) {
            justifiedLine.append(words[i]).append(" ".repeat(spaceBetweenWords));
            if (extraSpaces > 0) {
                justifiedLine.append(" ");
                extraSpaces--;
            }
        }

        justifiedLine.append(words[words.length - 1]);
        return justifiedLine.toString();
    }
}
