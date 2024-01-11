import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter number of nums: ");
        int numCount = scanner.nextInt();

        double sum = 0;
        for (int i = 1; i <= numCount; i++) {
            System.out.print("Enter number " + i + ": ");
            double number = scanner.nextDouble();
            sum += number;
        }

        double average = sum / numCount;
        System.out.println("The average is: " + average);
    }
}
