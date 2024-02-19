public class SwapStrings {

    public static void main(String[] args) {
        String a = "Hello";
        String b = "World";

        System.out.println("Before swap: a = " + a + ", b = " + b);

        // Swapping starts
        a = a + b; // Concatenate both strings
        b = a.substring(0, a.length() - b.length()); // Extract the original string 'a' from the concatenated string
        a = a.substring(b.length()); // Extract the original string 'b' from the concatenated string

        // Swapping ends

        System.out.println("After swap: a = " + a + ", b = " + b);
    }
}
