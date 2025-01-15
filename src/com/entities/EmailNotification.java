package com.entities;

import com.interfaces.Notification;

public class EmailNotification implements Notification {
   
	@Override
    public void notifyUser() {
        System.out.println("Sending an Email Notification");
    }
}

