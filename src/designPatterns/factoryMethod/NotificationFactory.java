package designPatterns.factoryMethod;

public class NotificationFactory {

    Notification instance;

    public Notification createNotification(String channel){
        if (channel == "Email"){
            return new EmailNotification();
        }
        else if (channel == "SMS"){
            return new SMSNotification();
        }
        else if (channel == "Push"){
            return new PushNotification();
        }
        else
            throw  new IllegalArgumentException();
    }

}
