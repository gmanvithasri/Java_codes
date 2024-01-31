import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Collections;

public class MaxMinChar {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        Map<Character, Integer> frequencyMap = getFrequencyMap(input);
        char maxChar = Collections.max(frequencyMap.entrySet(), Map.Entry.comparingByValue()).getKey();
        char minChar = Collections.min(frequencyMap.entrySet(), Map.Entry.comparingByValue()).getKey();

        System.out.println("Maximum occurring character: " + maxChar);
        System.out.println("Minimum occurring character: " + minChar);
    }

    private static Map<Character, Integer> getFrequencyMap(String str) {
        Map<Character, Integer> frequencyMap = new HashMap<>();

        for (char ch : str.toCharArray()) {
            frequencyMap.put(ch, frequencyMap.getOrDefault(ch, 0) + 1);
        }

        return frequencyMap;
    }
}
