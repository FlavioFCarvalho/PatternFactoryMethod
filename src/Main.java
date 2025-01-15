import com.factory.NotificationFactory;
import com.interfaces.Notification;

public class Main {
    public static void main(String[] args) {
        NotificationFactory factory = new NotificationFactory();

        // Criando e enviando uma notificação por email
        Notification emailNotification = factory.createNotification("email");
        emailNotification.notifyUser();

        // Criando e enviando uma notificação por SMS
        Notification smsNotification = factory.createNotification("sms");
        smsNotification.notifyUser();

        // Criando e enviando uma notificação push
        Notification pushNotification = factory.createNotification("push");
        pushNotification.notifyUser();
    }
}