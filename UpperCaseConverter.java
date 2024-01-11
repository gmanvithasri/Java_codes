import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
      
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        String upperCaseString = inputString.toUpperCase();

        System.out.println("The string in uppercase: " + upperCaseString);
    }
}
