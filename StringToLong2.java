//Long.valueOf()

public class StringToLong2 {
    public static void main(String[] args) {
        String str = "987654321";
        try {
            Long number = Long.valueOf(str);
            System.out.println("The Long object value is: " + number);
        } catch (NumberFormatException e) {
            System.out.println(str + " cannot be converted to a Long object");
        }
    }
}
