public class DoubleToStringFormatted {
    public static void main(String[] args) {
        double number = 123.4567;
        String formattedStr = String.format("%.2f", number); // Rounds to 2 decimal places
        System.out.println("Formatted string value is: " + formattedStr);
    }
}
