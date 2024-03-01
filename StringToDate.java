import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class StringToDate {
    public static void main(String[] args) {
        String dateString = "2023-03-25";
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");

        try {
            Date date = formatter.parse(dateString);
            System.out.println("Date converted from String: " + date);
        } catch (ParseException e) {
            System.out.println("An error occurred while parsing the date.");
        }
    }
}
