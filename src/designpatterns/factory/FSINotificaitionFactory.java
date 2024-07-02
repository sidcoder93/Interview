package designpatterns.factory;

public class FSINotificaitionFactory implements NotificationFactory{
    @Override
    public Notification notificationFactory() {
        return new FSINotification();
    }
}
