package com.entities;

import com.interfaces.Notification;

public class SMSNotification implements Notification {
    @Override
    public void notifyUser() {
        System.out.println("Sending an SMS Notification");
    }
}

