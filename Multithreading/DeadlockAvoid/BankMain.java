package Multithreading.DeadlockAvoid;

public class BankMain {
    public static void main(String[] args) {
        BankAccount rohan_acc = new BankAccount(101, "Rohan", 20000);

        BankAccount tushar_acc = new BankAccount(102, "Tushar", 30000);

        BankService bankService = new BankService();

        Thread thread1 = new Thread(() -> {
            bankService.transfer(rohan_acc, tushar_acc, 10000);
        }, "Transaction from Rohan's Account to Tushar's Account");

        Thread thread2 = new Thread(() -> {
            bankService.transfer(tushar_acc, rohan_acc, 15000);
        }, "Transaction from Tushar's Account to Rohan's Account");

        System.out.println("Starting transactions...");

        rohan_acc.display();
        tushar_acc.display();

        System.out.println("\nStarting transaction");

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        System.out.println("Main thread completed");
    }
}
