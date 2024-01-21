import java.util.Scanner;

public class WordCounter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string to count its words:");
        String inputString = scanner.nextLine();

        String[] words = inputString.split("\\s+");

        int wordCount = words.length;

        if(wordCount == 1 && words[0].isEmpty()) {
            wordCount = 0;
        }

        System.out.println("Number of words in the string: " + wordCount);
    }
}
