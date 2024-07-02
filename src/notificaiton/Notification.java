package notificaiton;

import java.time.LocalDate;
import java.util.Date;

public interface Notification {
    void sendNotificaiton(LocalDate date, String url);
}
