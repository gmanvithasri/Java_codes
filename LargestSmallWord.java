import java.util.Scanner;

public class LargestSmallestWord {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        String[] words = inputString.split("\\s+");
        
        String smallestWord = words[0];
        String largestWord = "";

        for (String word : words) {
            if (word.length() > largestWord.length()) {
                largestWord = word;
            }
            if (word.length() < smallestWord.length()) {
                smallestWord = word;
            }
        }

        System.out.println("Smallest word: " + smallestWord);
        System.out.println("Largest word: " + largestWord);
    }
}
