package designpatterns.factory;

public class Main {


    public static void main(String[] args) {


        NotificationFactory ob = new OBNotificationFactory();

        Notification notification = ob.notificationFactory();

        notification.sendNotification();

        NotificationFactory fsi = new FSINotificaitionFactory();
        fsi.notificationFactory().sendNotification();

    }
}
