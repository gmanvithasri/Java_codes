import java.util.Scanner;

public class StringSubsets {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        System.out.println("All subsets of the string are:");
        findSubsets(input);
    }

    private static void findSubsets(String str) {
        int n = str.length();

        // Total number of subsets is 2^n
        int totalSubsets = 1 << n;

        // Iterate through all possible combinations
        for (int i = 0; i < totalSubsets; i++) {
            StringBuilder subset = new StringBuilder();

            for (int j = 0; j < n; j++) {
                // Check if jth bit in i is set. If set, include jth character
                if ((i & (1 << j)) != 0) {
                    subset.append(str.charAt(j));
                }
            }

            System.out.println(subset);
        }
    }
}
