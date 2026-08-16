package Practicals;

import java.util.Scanner;

public class FoodOrder_Optimised {

    @SuppressWarnings("resource")
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Select Food Items : ");
        System.out.println(" 0.Exit");
        System.out.println(" 1.Full Burger Meal , Price : 110/-");
        System.out.println(" 2.Fries , Price : 90/-");
        System.out.println(" 3.Burger , Price : 99/-");

        System.out.print("Enter Choice :");
        int choice = sc.nextInt();

        if (choice == 0) {
            System.out.println("Thank You!!");
            return;
        }

        int quantity;
        double bill = 0, discount, finalBill;

        System.out.print("Enter Quantity : ");
        quantity = sc.nextInt();

        switch (choice) {
            case 1:
                bill = quantity * 110;
                break;
            case 2:
                bill = quantity * 90;
                break;
            case 3:
                bill = quantity * 99;
                break;
            default:
                System.out.println("Invalid Choice !!");
                return;
        }

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
        int deliveryType = sc.nextInt();

        if (deliveryType == 1) {
            System.out.println("Dine In Selected");
        } else if (deliveryType == 2) {
            System.out.println("Dine Out Selected");
        } else {
            System.out.println("Invalid Delivery Type");
        }

        System.out.println("Thank You !!!");
        sc.close();

    }

}
