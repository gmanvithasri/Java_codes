import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a character: ");
        char character = scanner.next().charAt(0);

        int asciiValue = character;

        System.out.println("The ASCII value of '" + character + "' is: " + asciiValue);
    }
}
