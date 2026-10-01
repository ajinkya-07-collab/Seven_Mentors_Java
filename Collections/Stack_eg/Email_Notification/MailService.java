package Collections.Stack_eg.Email_Notification;

import java.util.Stack;

public class MailService {

    private Stack<Mail> mails = new Stack<>();

    // Add mail
    public void addMail(Mail mail) {

        mails.push(mail);

        System.out.println("Mail Added: " + mail);
        System.out.println("Unread Mails: " + mails.size());
    }

    // Read mails one by one
    public void readMails() {

        System.out.println("\n--- Reading Mails ---");

        while (!mails.isEmpty()) {

            // Show latest mail
            System.out.println("\nLatest Mail: " + mails.peek());

            // Read/remove mail
            mails.pop();

            // Remaining unread mails
            System.out.println("Remaining Unread Mails: " + mails.size());
        }

        System.out.println("\nAll mails have been read.");
        System.out.println("Final Stack Size: " + mails.size());
    }
}