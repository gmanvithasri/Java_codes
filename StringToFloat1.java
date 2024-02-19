//Using Float.parseFloat()

public class StringToFloat1 {
    public static void main(String[] args) {
        String str = "23.45";
        try {
            float number = Float.parseFloat(str);
            System.out.println("The float value is: " + number);
        } catch (NumberFormatException e) {
            System.out.println(str + " cannot be converted to a float");
        }
    }
}
