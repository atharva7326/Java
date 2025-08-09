package wd;

public abstract class PaymentSystem {
    abstract void upiPayment();
    abstract void creditCardPayment();
    abstract void debitCardPayment();
}

class Upi extends PaymentSystem {
    void upiPayment() {
        System.out.println("UPI payment successfully!");
    }
    void creditCardPayment() {
        System.out.println("Credit card payment successfully!");
    }
    void debitCardPayment() {
        System.out.println("Debit card payment successfully!");
    }
}

class CreditCard extends PaymentSystem {
   

	void upiPayment() {
        System.out.println("UPI payment successfully!");
    }
    void creditCardPayment() {
        System.out.println("Credit card payment successfully!");
    }
    void debitCardPayment() {
        System.out.println("Debit card payment successfully!");
    }

  
}

class DebitCard extends PaymentSystem {
   

	void upiPayment() {
        System.out.println("UPI payment successfully!");
    }
    void creditCardPayment() {
        System.out.println("Credit card payment successfully!");
    }
    void debitCardPayment() {
        System.out.println("Debit card payment successfully!");
    }
}
