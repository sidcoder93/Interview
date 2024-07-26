package designpatterns.strategy.notificationservice;

public class NotificationSender {

    private Notification notification;

    public NotificationSender(Notification notification){
        this.notification = notification;
    }


    public void sendNotification(){
        notification.sendNotification();
    }


}
