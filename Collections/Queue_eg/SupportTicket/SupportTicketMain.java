package Collections.Queue_eg.SupportTicket;

public class SupportTicketMain {

    public static void main(String[] args) {

        SupportTicketSystem system = new SupportTicketSystem();

        system.submitTicket(new SupportTicketModel(101, "Amit", "Password Retreiving Failed!"));
        system.submitTicket(new SupportTicketModel(102, "Tushar", "Internet Issue!"));
        system.submitTicket(new SupportTicketModel(103, "Suraj", "VPN Failed!"));
        system.submitTicket(new SupportTicketModel(104, "Sumit", "Email server not working!"));

        system.showPendingTickets();
        System.out.println("==========================================");
        system.showNextTicket();
        System.out.println("==========================================");
        system.showNextTicket();
        System.out.println("==========================================");
        system.showNextTicket();
        System.out.println("==========================================");
        system.showNextTicket();
        system.showPendingTickets();
    }

}
