package designpatterns.factory;

public class OBNotificationFactory implements NotificationFactory{
    @Override
    public Notification notificationFactory() {
        return new OBNotificaiton();
    }
}
