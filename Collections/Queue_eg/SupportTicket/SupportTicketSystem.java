package Collections.Queue_eg.SupportTicket;

import java.util.*;

public class SupportTicketSystem {

    private Queue<SupportTicketModel> ticketQueue = new ArrayDeque<>();

    public void submitTicket(SupportTicketModel ticket) {

        ticketQueue.offer(ticket);
        System.out.println("Ticket submitted : " + ticket);

    }

    public void processNextTicket() {
        SupportTicketModel ticket = ticketQueue.poll();

        if (ticket == null) {
            System.out.println("No Tickets Pending!!");
            return;
        }

        System.out.println("Proceesing : " + ticket);
    }

    public void showNextTicket() {
        SupportTicketModel ticket = ticketQueue.peek();
        if (ticket == null) {
            System.out.println("No Tickets Pending!!");
            return;
        }

        System.out.println("Next Ticket : " + ticket);

    }

    public void showPendingTickets() {
        System.out.println("\nPending Tickets : ");
        for (SupportTicketModel ticket : ticketQueue) {
            System.out.println(ticket);
        }
    }
}
