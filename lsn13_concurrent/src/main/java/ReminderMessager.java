import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ReminderMessager {
    private  static ScheduledExecutorService service = Executors.newScheduledThreadPool(1);

    public  static  void main (String... args) {
        Reminder reminder = new Reminder();

        service.schedule(reminder,10, TimeUnit.MILLISECONDS );
    }
}
