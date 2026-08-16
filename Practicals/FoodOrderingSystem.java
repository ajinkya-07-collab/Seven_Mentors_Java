package Practicals;

import java.util.Scanner;

// Practical 1: Online Food Ordering System
// Scenario
// A food ordering system where user:
// ●	Selects food items 
// ●	Enters quantity 
// ●	System calculates total bill 
// ●	Applies discount rules 
// ●	Selects delivery type 
// ●	Tracks order status 
// ________________________________________
// Concepts Used
// while → multiple item ordering
// switch → menu + delivery selection
// if-else → discount + validation
// Loop + condition → order + tracking

public class FoodOrderingSystem {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int choice;
        do {
            System.out.println("Select Food Items : ");
            System.out.println(" 0.Exit");
            System.out.println(" 1.Full Burger Meal , Price : 110/-");
            System.out.println(" 2.Fries , Price : 90/-");
            System.out.println(" 3.Burger , Price : 99/-");

            System.out.print("Enter Choice :");
            choice = sc.nextInt();

            int quantity;
            double bill;
            double discount;
            double finalBill;
            switch (choice) {
                case 1:
                    System.out.print("Enter Quantity : ");
                    quantity = sc.nextInt();
                    bill = quantity * 110;
                    if (bill > 100) {
                        discount = bill * 0.05;
                    } else {
                        discount = 0;
                    }
                    discount = bill * 0.05;
                    finalBill = bill - discount;
                    System.out.println("Total Bill : " + bill);
                    System.out.println("Discount : " + discount);
                    System.out.println("Final Bill : " + finalBill);

                    System.out.println("Enter Delivery Type :");
                    System.out.println("1. Dine In");
                    System.out.println("2. Dine Out");
                    sc.nextInt();
                    System.out.println("Thank You !!!");

                    break;

                case 2:
                    System.out.print("Enter Quantity : ");
                    quantity = sc.nextInt();
                    bill = quantity * 90;
                    if (bill > 100) {
                        discount = bill * 0.05;
                    } else {
                        discount = 0;
                    }
                    discount = bill * 0.05;
                    finalBill = bill - discount;
                    System.out.println("Total Bill : " + bill);
                    System.out.println("Discount : " + discount);
                    System.out.println("Final Bill : " + finalBill);
                    System.out.println("Enter Delivery Type :");
                    System.out.println("1. Dine In");
                    System.out.println("2. Dine Out");
                    sc.nextInt();
                    System.out.println("Thank You !!!");

                    break;

                case 3:
                    System.out.print("Enter Quantity : ");
                    quantity = sc.nextInt();
                    bill = quantity * 110;
                    if (bill > 100) {
                        discount = bill * 0.05;
                    } else {
                        discount = 0;
                    }
                    finalBill = bill - discount;
                    System.out.println("Total Bill : " + bill);
                    System.out.println("Discount : " + discount);
                    System.out.println("Final Bill : " + finalBill);
                    System.out.println("Enter Delivery Type :");
                    System.out.println("1. Dine In");
                    System.out.println("2. Dine Out");
                    sc.nextInt();
                    System.out.println("Thank You !!!");

                    break;

                default:
                    System.out.println("Thank You");
            }

        } while (choice != 0);
        sc.close();
    }

}
