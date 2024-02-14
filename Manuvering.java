import java.util.Scanner;

public class manuvering {
    static int numberOfPaths(int m, int n) {
        if (m == 1 || n == 1)
            return 1;
        return numberOfPaths(m - 1, n) + numberOfPaths(m, n - 1);
    }

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of rows in the grid:");
        int rows = scanner.nextInt();

        System.out.println("Enter the number of columns in the grid:");
        int cols = scanner.nextInt();

        System.out.println("Number of paths in the grid: " + numberOfPaths(rows, cols));
    }
}
