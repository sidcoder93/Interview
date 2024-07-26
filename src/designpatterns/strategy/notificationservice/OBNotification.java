package designpatterns.strategy.notificationservice;

import java.util.List;
import java.util.stream.Collectors;

public class OBNotification implements Notification{
    @Override
    public void sendNotification() {
        System.out.println("Notification Sent to OB service");
        List<String> list = List.of("SIddharth", "Ajay", "Aayushi", "Virendra", "Ajit", "Neha");
        list = list.stream()
                .filter(name -> name.startsWith("A"))
                .collect(Collectors.toList());

        System.out.println(list);
    }
}
