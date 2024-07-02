package designpatterns.factory;

public class FSINotification implements Notification{
    @Override
    public void sendNotification() {
        System.out.println("FSI Notification Sent");

    }
}
