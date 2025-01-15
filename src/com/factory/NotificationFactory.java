package com.factory;

import com.entities.EmailNotification;
import com.entities.PushNotification;
import com.entities.SMSNotification;
import com.interfaces.Notification;

public class NotificationFactory {
    // M�todo f�brica para retornar a notifica��o correta
    public Notification createNotification(String type) {
        if (type == null || type.isEmpty()) {
            return null;
        }
        switch (type.toLowerCase()) {
            case "email":
                return new EmailNotification();
            case "sms":
                return new SMSNotification();
            case "push":
                return new PushNotification();
            default:
                throw new IllegalArgumentException("Unknown notification type: " + type);
        }
    }
}

