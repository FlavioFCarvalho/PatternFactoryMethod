import com.factory.NotificationFactory;
import com.interfaces.Notification;

public class Main {
    public static void main(String[] args) {
        NotificationFactory factory = new NotificationFactory();

        // Criando e enviando uma notifica��o por email
        Notification emailNotification = factory.createNotification("email");
        emailNotification.notifyUser();

        // Criando e enviando uma notifica��o por SMS
        Notification smsNotification = factory.createNotification("sms");
        smsNotification.notifyUser();

        // Criando e enviando uma notifica��o push
        Notification pushNotification = factory.createNotification("push");
        pushNotification.notifyUser();
    }
}