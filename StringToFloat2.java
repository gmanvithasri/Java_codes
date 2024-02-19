//Using Float.valueOf()

public class StringToFloat2 {
    public static void main(String[] args) {
        String str = "67.89";
        try {
            Float number = Float.valueOf(str);
            System.out.println("The Float object value is: " + number);
        } catch (NumberFormatException e) {
            System.out.println(str + " cannot be converted to a Float object");
        }
    }
}
