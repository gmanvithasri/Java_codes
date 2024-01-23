import java.util.Scanner;

public class PunctuationCount {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        int punctuationCount = countPunctuation(inputString);
        System.out.println("The total number of punctuation characters in the string is: " + punctuationCount);
    }

    private static int countPunctuation(String str) {
        String punctuations = ".,:;!?(){}[]'\"-";
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (punctuations.indexOf(ch) != -1) {
                count++;
            }
        }
        return count;
    }
}
