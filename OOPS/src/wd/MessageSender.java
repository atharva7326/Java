//MessageSender-> sendMessageoverridden by Email, SMS.
package wd;
class MessageSender {
    void sendMessage() {
        System.out.println("Sending a message...");
    }
}

class EmailSender extends MessageSender {

    void sendMessage() {
        System.out.println("Sending message via Email...");
    }
}


class SMSSender extends MessageSender {
    void sendMessage() {
        System.out.println("Sending message via SMS...");
    }
}
