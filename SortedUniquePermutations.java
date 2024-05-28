import java.util.*;

public class Main {
    public static void main(String[] args) {
        String str = "rst";
        generatePermutations(str);
    }

    public static void generatePermutations(String str) {
        char[] c = str.toCharArray();
        Arrays.sort(c);
        str = new String(c);
        Set<String> resultSet = new TreeSet<>();
        generatePermutationsHelper(str.toCharArray(), 0, resultSet);
        for (String i : resultSet) {
            System.out.println(i);
        }
    }

    private static void generatePermutationsHelper(char[] chars, int index, Set<String> resultSet) {
        if (index == chars.length - 1) {
            resultSet.add(new String(chars));
            return;
        }
        for (int i = index; i < chars.length; i++) {
            swap(chars, i, index);
            generatePermutationsHelper(chars, index + 1, resultSet);
            swap(chars, i, index);
        }
    }

    private static void swap(char[] chars, int i, int j) {
        char temp = chars[i];
        chars[i] = chars[j];
        chars[j] = temp;
    }
}
