import java.text.SimpleDateFormat;
import java.util.Date;

public class DateToString {
    public static void main(String[] args) {
        Date date = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String dateString = formatter.format(date);
        System.out.println("Date converted to String: " + dateString);
    }
}
