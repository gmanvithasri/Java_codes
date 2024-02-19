//using parseInt

public class StringToInt {
    public static void main(String[] args) {
        String numberAsString = "1234";
        try {
            int number = Integer.parseInt(numberAsString);
            System.out.println("The string converted to int is " + number);
        } catch (NumberFormatException e) {
            System.out.println(numberAsString + " is not a valid integer number.");
        }
    }
}
