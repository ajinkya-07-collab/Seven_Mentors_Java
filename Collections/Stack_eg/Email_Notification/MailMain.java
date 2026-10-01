package Collections.Stack_eg.Email_Notification;

public class MailMain {

    public static void main(String[] args) {

        MailService service = new MailService();

        service.addMail(new Mail("Mail - 1", "Message -1"));
        service.addMail(new Mail("Mail - 2", "Message -2"));
        service.addMail(new Mail("Mail - 3", "Message -3"));
        service.addMail(new Mail("Mail - 4", "Message -4"));
        service.addMail(new Mail("Mail - 5", "Message -5"));

        service.readMails();
    }
}