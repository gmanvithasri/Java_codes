public class PalindromeFinder {

    // Method to check if a string is a palindrome
    private static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;
        
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        String input = "madam racecar apple kayak song noon";
        String[] words = input.split(" ");
        String smallestPalindrome = null;
        String largestPalindrome = null;

        for (String word : words) {
            if (isPalindrome(word)) {
                if (smallestPalindrome == null || word.length() < smallestPalindrome.length()) {
                    smallestPalindrome = word;
                }
                if (largestPalindrome == null || word.length() > largestPalindrome.length()) {
                    largestPalindrome = word;
                }
            }
        }

        if (smallestPalindrome != null) {
            System.out.println("Smallest palindrome: " + smallestPalindrome);
        } else {
            System.out.println("No palindrome found.");
        }

        if (largestPalindrome != null) {
            System.out.println("Largest palindrome: " + largestPalindrome);
        } else {
            System.out.println("No palindrome found.");
        }
    }
}
