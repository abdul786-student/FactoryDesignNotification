package com.Factory.DesignPatternNotification;

public class NotificationFactory {
	public Notification createNotification(String channel){
		if(channel==null||channel.isEmpty())
			return null;
		if(channel.equals("SMS")) {
			return new SMSNotification();
		}
		else if(channel.equals("Email")){
			return new EmailNotification();
		}
		else if(channel.equals("Push")){
			return new PushNotification();
		}
		return null;

	}
}
