import java.util.*;
import java.lang.*;
import java.io.*;

class Solution {
    public List<String> letterCombinations(String digits) {
        if (digits.isEmpty()) return Collections.emptyList();

        String[] phone_map = {"abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        List<String> output = new ArrayList<>();
        backtrack("", digits, phone_map, output);
        return output;
    }

    private void backtrack(String combination, String next_digits, String[] phone_map, List<String> output) {
        if (next_digits.isEmpty()) {
            output.add(combination);
        } else {
            String letters = phone_map[next_digits.charAt(0) - '2'];
            for (char letter : letters.toCharArray()) {
                backtrack(combination + letter, next_digits.substring(1), phone_map, output);
            }
        }
    }
}

class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
        String s = sc.next();
        Solution solution = new Solution();
        for(String i :solution.letterCombinations(s)) {
            System.out.print(i + " ");
        }
        sc.close();
	}
}
