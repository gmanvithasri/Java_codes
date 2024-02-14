import java.util.Scanner;

class JosephusTrap {

    static int josephus(int n, int k) {
        if (n == 1)
            return 1;
        else
            return (josephus(n - 1, k) + k - 1) % n + 1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the total number of people (n):");
        int n = scanner.nextInt();

        System.out.println("Enter the counting interval (k):");
        int k = scanner.nextInt();

        System.out.println("The chosen place is " + josephus(n, k));
    }
}
