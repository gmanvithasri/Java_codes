import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateToString1 {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String dateString = now.format(formatter);
        System.out.println("Date converted to String: " + dateString);
    }
}
