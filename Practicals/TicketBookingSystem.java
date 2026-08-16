package Practicals;

import java.util.Scanner;

public class TicketBookingSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int availableSeats = 15;
        int choice, tickets;
        double fare = 0, totalBill;

        while (true) {

            System.out.println("\n===== BUS TICKET BOOKING =====");
            System.out.println("0. Exit");
            System.out.println("1. Pune to Mumbai (₹350)");
            System.out.println("2. Pune to Nashik (₹250)");
            System.out.println("3. Pune to Kolhapur (₹400)");
            System.out.print("Select Route: ");
            choice = sc.nextInt();

            if (choice == 0) {
                System.out.println("Thank You!");
                break;
            }

            switch (choice) {
                case 1:
                    fare = 350;
                    break;

                case 2:
                    fare = 250;
                    break;

                case 3:
                    fare = 400;
                    break;

                default:
                    System.out.println("Invalid Route!");
                    continue;
            }

            System.out.print("Enter Number of Tickets: ");
            tickets = sc.nextInt();

            while (tickets > availableSeats || tickets <= 0) {
                System.out.println("Only " + availableSeats + " seats are available.");
                System.out.print("Re-enter Tickets: ");
                tickets = sc.nextInt();
            }

            totalBill = fare * tickets;

            if (tickets >= 5) {
                System.out.println("Group Booking Discount: 10%");
                totalBill = totalBill - (totalBill * 0.10);
            }

            System.out.println("Total Fare = " + totalBill);

            System.out.print("Proceed with Booking? (1-Yes / 2-No): ");
            int confirm = sc.nextInt();

            if (confirm == 1) {
                availableSeats -= tickets;
                System.out.println("Booking Successful!");
                System.out.println("Seats Left: " + availableSeats);
            } else {
                System.out.println("Booking Cancelled.");
            }
        }

        sc.close();
    }
}
