package wd;

public abstract class NotificationSystem {
	abstract void emailNotification();

	abstract void smsNotification();

	abstract void pushNotification();
}

class EmailNotif extends NotificationSystem {
	void emailNotification() {
        System.out.println("This is email notification.");
	}

	void smsNotification() {
		 System.out.println("This is sms notification.");
	}

	void pushNotification() {
		 System.out.println("This is push notification.");
	}
}

class SmsNotif extends NotificationSystem {
	void emailNotification() {
        System.out.println("This is email notification.");
	}

	void smsNotification() {
		 System.out.println("This is sms notification.");
	}

	void pushNotification() {
		 System.out.println("This is push notification.");
	}
}
class PushNotif extends NotificationSystem {
	void emailNotification() {
        System.out.println("This is email notification.");
	}

	void smsNotification() {
		 System.out.println("This is sms notification.");
	}

	void pushNotification() {
		 System.out.println("This is push notification.");
	}
}