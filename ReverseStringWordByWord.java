public class ReverseStringWordByWord {

    public static String reverseWords(String str) {
        String[] words = str.split("\\s+");
        StringBuilder reversedString = new StringBuilder();

        for (int i = words.length - 1; i >= 0; i--) {
            reversedString.append(words[i]).append(" ");
        }

        // Trim to remove the trailing space
        return reversedString.toString().trim();
    }

    public static void main(String[] args) {
        String input = "Java Programming Language";
        String reversed = reverseWords(input);
        System.out.println("Original string: " + input);
        System.out.println("Reversed string: " + reversed);
    }
}
