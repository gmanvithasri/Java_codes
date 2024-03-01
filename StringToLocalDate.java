import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class StringToLocalDate {
    public static void main(String[] args) {
        String dateString = "2023-03-25";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        
        LocalDate date = LocalDate.parse(dateString, formatter);
        System.out.println("Date converted from String: " + date);
    }
}
