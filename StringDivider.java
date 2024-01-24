import java.util.Scanner;

public class StringDivider {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the string: ");
        String inputString = scanner.nextLine();

        System.out.print("Enter the number of parts: ");
        int n = scanner.nextInt();

        divideString(inputString, n);
    }

    private static void divideString(String str, int n) {
        int strLength = str.length();

        if (strLength % n != 0) {
            System.out.println("The string cannot be divided into " + n + " equal parts.");
            return;
        }

        int partSize = strLength / n;
        for (int i = 0; i < strLength; i += partSize) {
            System.out.println(str.substring(i, i + partSize));
        }
    }
}
