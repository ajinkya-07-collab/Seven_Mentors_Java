package OOPs.Interface.Payment;

import java.util.Scanner;

public class MainPayment {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println(
                "Please Select the payment mehtod :\n1.UPI Payment\n2.Credit Card Payment\n3.Debit Card Payment");

        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                UPIPaymant upi = new UPIPaymant();
                upi.pay();
                break;
            case 2:
                DebitCardPayment db = new DebitCardPayment();
                db.pay();
                break;
            case 3:
                CreditCardPayment cd = new CreditCardPayment();
                cd.pay();
            default:
                System.out.println("Invalid Choice");
                break;
        }

        sc.close();

    }

}
