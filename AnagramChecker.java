import java.util.Arrays;
import java.util.Scanner;

public class AnagramChecker {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first string: ");
        String string1 = scanner.nextLine();

        System.out.print("Enter the second string: ");
        String string2 = scanner.nextLine();

        if (areAnagrams(string1, string2)) {
            System.out.println("The two strings are anagrams.");
        } else {
            System.out.println("The two strings are not anagrams.");
        }
    }

    private static boolean areAnagrams(String str1, String str2) {
        str1 = str1.replaceAll("[\\W]", "").toLowerCase();
        str2 = str2.replaceAll("[\\W]", "").toLowerCase();

        if (str1.length() != str2.length()) {
            return false;
        }

        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();

        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        return Arrays.equals(charArray1, charArray2);
    }
}
