package designpatterns.strategy.notificationservice;

public class Main {


    public static void main(String[] args) {

        NotificationSender ns = new NotificationSender(new OBNotification());

        ns.sendNotification();


    }
}
