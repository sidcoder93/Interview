package notificaiton;

import java.time.LocalDate;

public class NotificaitionImpl implements Notification{
    @Override
    public void sendNotificaiton(LocalDate date, String url) {

        System.out.println("Notification sent to "+url+ " for Date "+date);

    }
}
