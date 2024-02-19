public class SeparateCharacters {

    public static void main(String[] args) {
        String inputString = "Hello, World!";
        System.out.println("Individual characters from the string:");

        for (int i = 0; i < inputString.length(); i++) {
            System.out.println(inputString.charAt(i));
        }
    }
}
