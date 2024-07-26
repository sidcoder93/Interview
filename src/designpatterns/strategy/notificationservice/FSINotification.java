package designpatterns.strategy.notificationservice;

public class FSINotification implements Notification{
    @Override
    public void sendNotification() {

        System.out.println("Notification sent to FSI service");

    }
}
