import java.util.Scanner;

public class LongestRepeatingSequence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        String longestRepeatingSequence = findLongestRepeatingSequence(inputString);
        if (longestRepeatingSequence.length() > 0) {
            System.out.println("The longest repeating sequence is: " + longestRepeatingSequence);
        } else {
            System.out.println("No repeating sequence found.");
        }
    }

    private static String findLongestRepeatingSequence(String str) {
        int n = str.length();
        int[][] dp = new int[n + 1][n + 1];
        String result = ""; // Store longest repeating sequence

        for (int i = 1; i <= n; i++) {
            for (int j = i + 1; j <= n; j++) {
                // If characters match and indexes are not same
                if (str.charAt(i - 1) == str.charAt(j - 1) && dp[i - 1][j - 1] < (j - i)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                    if (dp[i][j] > result.length()) {
                        result = str.substring(i - dp[i][j], i);
                    }
                } else {
                    dp[i][j] = 0;
                }
            }
        }
        return result;
    }
}
