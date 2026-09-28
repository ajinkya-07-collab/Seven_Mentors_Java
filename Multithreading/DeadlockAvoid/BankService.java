package Multithreading.DeadlockAvoid;

public class BankService {
    public void transfer(BankAccount from, BankAccount to, double amount) {

        BankAccount first;
        BankAccount second;

        if (from.getAccountNumber() < to.getAccountNumber()) {
            first = from;
            second = to;
        } else {
            first = to;
            second = from;
        }

        synchronized (first) {
            System.out.println(Thread.currentThread().getName() + " locked account" + first.getAccountNumber());

            synchronized (second) {
                System.out
                        .println(Thread.currentThread().getName() + " locked account " + second.getAccountNumber());

                if (from.getBalance() >= amount) {
                    from.withdraw(amount);
                    to.deposite(amount);
                    System.out.println(Thread.currentThread().getName() + " transfered Rs. " + amount);
                }
            }
        }
    }
}
