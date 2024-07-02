package notificaiton;

import java.time.LocalDate;
import java.time.chrono.ChronoLocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Notification notification = new NotificaitionImpl();

        List<LocalDate> list = new ArrayList<>();

        list.add(LocalDate.now());
        list.add(LocalDate.of(2023,11, 17));
        list.add(LocalDate.of(2024,12,24));

        list.forEach(e -> notification.sendNotificaiton(e, "OB"));
    }
}
