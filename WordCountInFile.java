import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class WordCountInFile {

    public static void main(String[] args) {
        String filePath = "path/to/your/textfile.txt"; // Replace with your file path
        try {
            File file = new File(filePath);
            Scanner scanner = new Scanner(file);
            int wordCount = 0;

            while (scanner.hasNext()) {
                scanner.next();
                wordCount++;
            }

            System.out.println("Total number of words in the file: " + wordCount);
            scanner.close();
        } catch (FileNotFoundException e) {
            System.err.println("File not found: " + e.getMessage());
        }
    }
}
