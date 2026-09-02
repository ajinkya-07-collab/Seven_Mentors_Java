package ExceptionHandling.customException.service;

import ExceptionHandling.customException.exception.*;
import ExceptionHandling.customException.model.*;

public class BankService {

    private BankAccount account;

    public void createAccount(int accountNumber, String accountHolder, double initialBalance)
            throws InsufficientBalanceException, InvalidAmountException {

        if (accountNumber <= 0) {
            throw new InvalidAmountException("Account Number must be greater than Zero");
        }

        if (accountHolder == null || accountHolder.trim().isEmpty()) {
            throw new InvalidAmountException("Account Holder name cannot be Empty");
        }

        if (initialBalance < 0) {
            throw new InvalidAmountException("Initial Balance cannot be Negative");
        }

        account = new BankAccount(accountNumber, accountHolder, initialBalance);

        System.out.println("Account Created Succesfully !!!");
        System.out.println("Initial Balance : " + initialBalance);

    }

    public void deposit(double amount) throws InvalidAmountException {
        if (amount <= 0) {
            throw new InvalidAmountException("Deposit Amount must be greater than Zero");
        }

        account.deposit(amount);
        System.out.println("Amount of Rs." + amount + " deposited Successfully !!!");

    }

    public void withdraw(double amount) throws InvalidAmountException, InsufficientBalanceException {
        if (amount <= 0) {
            throw new InvalidAmountException("Withdraw Ammount must be greater than Zero");
        }

        if (amount > account.getBalance()) {
            throw new InsufficientBalanceException(
                    "Insufficient Balance. Available Balance is : " + account.getBalance());
        }

        account.withdraw(amount);
        System.out.println("Amount of " + amount + " withdrawal Successfull !!!");

    }

    public void showAcc() {
        account.displayAccount();
    }
}
