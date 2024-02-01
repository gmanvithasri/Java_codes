import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MostRepeatedWordInFile {

    public static void main(String[] args) {
        String filePath = "path/to/your/textfile.txt"; // Replace with your file path
        try {
            File file = new File(filePath);
            Scanner scanner = new Scanner(file);

            Map<String, Integer> wordCounts = new HashMap<>();
            while (scanner.hasNext()) {
                String word = scanner.next().replaceAll("[^a-zA-Z]", "").toLowerCase();
                wordCounts.put(word, wordCounts.getOrDefault(word, 0) + 1);
            }

            String mostRepeatedWord = null;
            int maxCount = 0;
            for (Map.Entry<String, Integer> entry : wordCounts.entrySet()) {
                if (entry.getValue() > maxCount) {
                    mostRepeatedWord = entry.getKey();
                    maxCount = entry.getValue();
                }
            }

            System.out.println("Most repeated word: " + mostRepeatedWord);
            scanner.close();
        } catch (FileNotFoundException e) {
            System.err.println("File not found: " + e.getMessage());
        }
    }
}
