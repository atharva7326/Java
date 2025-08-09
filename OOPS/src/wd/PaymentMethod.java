//1. Shape hierarchy: abstract class Shape with area() method.
//2. Payment system: abstract class for payment with credit card, UPI, etc.
//3. Notification system: abstract class with email, SMS, push notification.
//4. Vehicle abstraction: abstract Vehicle with startEngine().
//5. Remote control device: abstract class Remote with turnOn/Off methods.
 
 

package wd;

public class PaymentMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PaymentSystem upi = new Upi();
		PaymentSystem creditCard = new CreditCard();
		PaymentSystem debitCard = new DebitCard();
		
		upi.upiPayment();
		creditCard.creditCardPayment();
		debitCard.debitCardPayment();

	}

}
