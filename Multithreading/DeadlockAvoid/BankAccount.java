package Multithreading.DeadlockAvoid;

public class BankAccount {
    private int accountNumber;
    private String holderName;
    private double balance;

    public BankAccount(int accountNumber, String holderName, double balance) {
        super();
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getHolderName() {
        return holderName;
    }

    public void setHolderName(String holderName) {
        this.holderName = holderName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void withdraw(double amount) {
        balance = balance - amount;
    }

    public void deposite(double amount) {
        balance = balance + amount;
    }

    public void display() {
        System.out.println(accountNumber + " | " + holderName + " | Balance: Rs. " + balance);
    }
}
