import java.time.LocalDate;
import java.util.Date;
import java.util.Locale;

public class Notification {
    private final String message;
    private final LocalDate date;

    public Notification(String message, LocalDate date) {
        this.message = message;
        this.date = date;
    }

    public String getMessage() {
        return message;
    }
}
