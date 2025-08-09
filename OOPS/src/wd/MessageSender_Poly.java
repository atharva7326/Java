package wd;

public class MessageSender_Poly {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MessageSender m = new EmailSender(); //upcasting
		m.sendMessage();
		
		MessageSender m2 = new SMSSender();
		m2.sendMessage();

	}

}
