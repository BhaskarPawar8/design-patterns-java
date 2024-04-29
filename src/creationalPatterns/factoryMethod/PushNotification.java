package creationalPatterns.factoryMethod;

public class PushNotification implements Notification{
    @Override
    public void notifyUser() {
        System.out.println("Push Notification..");
    }
}
