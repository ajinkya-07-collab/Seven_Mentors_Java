package ExceptionHandling.customException.model;

public class BankAccount {

    private int accountNumber;
    private String accountHolder;
    private double balance;

    public BankAccount(int accountNumber, String accountHolder, double balance) {
        // super();
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void withdraw(double Amount) {
        balance -= Amount;
    }

    public void deposit(double Amount) {
        balance += Amount;
    }

    public void displayAccount() {
        System.out.println("----------------------------------");
        System.out.println("Account Number : " + accountNumber);
        System.out.println("Account Holder : " + accountHolder);
        System.out.println("Balance : " + balance);
        System.out.println("----------------------------------");

    }

}
