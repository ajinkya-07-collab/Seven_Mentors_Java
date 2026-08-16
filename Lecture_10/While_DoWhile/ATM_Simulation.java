package Lecture_10.While_DoWhile;

import java.util.Scanner;

public class ATM_Simulation {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int balance = 10000;
        int choice;

        do {

            System.out.println("1 : Check Balance");
            System.out.println("2 : Withdraw");
            System.out.println("3 : Deposit");
            System.out.println("4 : Exit");

            System.out.print("Enter Choice : ");
            choice = sc.nextInt();

            if (choice == 1) {
                System.out.println("Balance : $" + balance);
            } else if (choice == 2) {
                System.out.print("Enter Withdrawal Amount : ");
                int Withdrawal = sc.nextInt();

                if (Withdrawal <= 0) {
                    System.out.println("Invalid Withdarwal Amount");
                } else if (Withdrawal > 2000) {
                    System.out.println("Withdrawal limit is $20000");
                } else if (Withdrawal > balance) {
                    System.out.println("Insufficient Balance");
                } else if (Withdrawal % 100 == 0) {
                    System.out.println("Withdrwal should be in 100 multiples");
                } else {
                    balance -= Withdrawal;
                    System.out.println("Collect Ur Cash");
                }
            } else if (choice == 3) {

                System.out.print("Enter deposit amount: ");
                int deposit = sc.nextInt();

                if (deposit <= 0) {
                    System.out.println("Invalid deposit amount");
                } else if (deposit > 50000) {
                    System.out.println("Deposit limit is $50000");
                } else {
                    balance += deposit;
                    System.out.println("Deposit successful");
                }

            } else if (choice == 4) {

                System.out.println("Thank you");

            } else {

                System.out.println("Invalid choice");

            }
        } while (choice != 4);
    }

}
