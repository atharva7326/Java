package wd;

public class NotificationSystem_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		NotificationSystem n1 = new EmailNotif();
		n1.emailNotification();
		
		NotificationSystem n2 = new SmsNotif();
		n2.smsNotification();
		
		NotificationSystem n3 = new PushNotif();
		n3.pushNotification();

	}

}
