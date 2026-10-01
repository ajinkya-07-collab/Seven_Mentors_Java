package Collections.Queue_eg.SupportTicket;

public class SupportTicketModel {

    private int ticketId;
    private String customerName;
    private String issue;

    public SupportTicketModel(int id, String customerName, String issue) {
        this.ticketId = id;
        this.customerName = customerName;
        this.issue = issue;
    }

    public int getId() {
        return ticketId;
    }

    public void setId(int id) {
        this.ticketId = id;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getIssue() {
        return issue;
    }

    public void setIssue(String issue) {
        this.issue = issue;
    }

    @Override
    public String toString() {
        return "SupportTicketModel [id=" + ticketId + ", customerName=" + customerName + ", issue=" + issue + "]";
    }

}
