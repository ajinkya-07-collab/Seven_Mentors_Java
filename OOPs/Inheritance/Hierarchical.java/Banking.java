
public class Banking {

    String bankName;
    String accountHolder;
    long accNumber;
    String address;
    int amount;

    public Banking(String bankName, String accountHolder, long accNumber,
            String address, int amount) {

        this.bankName = bankName;
        this.accountHolder = accountHolder;
        this.accNumber = accNumber;
        this.address = address;
        this.amount = amount;
    }

    public void displayBank() {
        System.out.println("Bank Name: " + bankName);
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Account Number: " + accNumber);
        System.out.println("Address: " + address);
        System.out.println("Amount: " + amount);
    }
}
