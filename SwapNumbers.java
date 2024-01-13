public class SwapNumbers {

    public static void main(String[] args) {
        int number1 = 10;
        int number2 = 20;

        System.out.println("Before swap:");
        System.out.println("Number 1 = " + number1);
        System.out.println("Number 2 = " + number2);

        int temp = number1;
        number1 = number2;
        number2 = temp;

        System.out.println("\nAfter swap:");
        System.out.println("Number 1 = " + number1);
        System.out.println("Number 2 = " + number2);
    }
}
