//using Integer.valueOf()

public class StringToIntegerExample {
    public static void main(String[] args) {
        String str = "200";
        try {
            Integer number = Integer.valueOf(str);
            System.out.println("The Integer object value is: " + number);
        } catch (NumberFormatException e) {
            System.out.println(str + " cannot be converted to an Integer object");
        }
    }
}
