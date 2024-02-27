public class StringToDoubleSafeExample {
    public static void main(String[] args) {
        String numberStr = "not a number";
        try {
            double number = Double.parseDouble(numberStr);
            System.out.println("The double value is: " + number);
        } catch (NumberFormatException e) {
            System.out.println("Error: The string does not contain a parsable double.");
        }
    }
}
