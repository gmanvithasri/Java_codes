import java.util.Scanner;

public class SmallestOfThreeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int firstNumber = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int secondNumber = scanner.nextInt();

        System.out.print("Enter the third number: ");
        int thirdNumber = scanner.nextInt();

        int smallest = findSmallest(firstNumber, secondNumber, thirdNumber);
        System.out.println("The smallest number is: " + smallest);
    }

    private static int findSmallest(int num1, int num2, int num3) {
        return (num1 < num2) ? ((num1 < num3) ? num1 : num3) : ((num2 < num3) ? num2 : num3);
    }
}
