import java.util.Scanner;

public class VowelConsonantCount {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        int[] counts = countVowelsAndConsonants(inputString);
        System.out.println("Number of vowels in the string: " + counts[0]);
        System.out.println("Number of consonants in the string: " + counts[1]);
    }

    private static int[] countVowelsAndConsonants(String str) {
        int vowelCount = 0;
        int consonantCount = 0;
        String vowels = "aeiouAEIOU";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isLetter(ch)) {
                if (vowels.indexOf(ch) != -1) {
                    vowelCount++;
                } else {
                    consonantCount++;
                }
            }
        }

        return new int[]{vowelCount, consonantCount};
    }
}
