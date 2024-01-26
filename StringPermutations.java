import java.util.Scanner;

public class StringPermutations {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        System.out.println("All permutations of the string are:");
        generatePermutations(input, 0, input.length() - 1);
    }

    private static void generatePermutations(String str, int start, int end) {
        if (start == end) {
            System.out.println(str);
        } else {
            for (int i = start; i <= end; i++) {
                str = swap(str, start, i);
                generatePermutations(str, start + 1, end);
                str = swap(str, start, i); // Backtrack
            }
        }
    }

    private static String swap(String a, int i, int j) {
        char[] charArray = a.toCharArray();
        char temp = charArray[i];
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return String.valueOf(charArray);
    }
}
