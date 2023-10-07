package designPatterns.factoryMethod;

public class NotificationService {

    public static void main(String[] args) {
        NotificationFactory notificationFactory = new NotificationFactory();
        Notification instance = notificationFactory.createNotification("Email");

        instance.notifyUser();
    }
}
