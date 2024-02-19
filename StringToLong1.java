//Using Long.parseLong()

public class StringToLongExample {
    public static void main(String[] args) {
        String str = "123456789";
        try {
            long number = Long.parseLong(str);
            System.out.println("The long value is: " + number);
        } catch (NumberFormatException e) {
            System.out.println(str + " cannot be converted to a long");
        }
    }
}
