package Collections.Stack_eg.Email_Notification;

public class Mail {

    private String sender;
    private String subject;

    public Mail(String sender, String subject) {
        this.sender = sender;
        this.subject = subject;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    public String toString() {
        return "Sender: " + sender + ", Subject: " + subject;
    }
}