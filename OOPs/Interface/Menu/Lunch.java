import java.util.Scanner;

public class Lunch implements FoodMenu {

    Scanner sc = new Scanner(System.in);

    @Override
    public void displayMenu() {

        while (true) {

            System.out.println("\n===== LUNCH MENU =====");
            System.out.println("1. Veg Thali    - ₹120");
            System.out.println("2. Paneer Rice  - ₹100");
            System.out.println("3. Dal Rice     - ₹80");
            System.out.println("4. Biryani      - ₹150");
            System.out.println("0. Exit");

            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            String item = "";
            int price = 0;

            switch (choice) {

                case 1:
                    item = "Veg Thali";
                    price = 120;
                    break;

                case 2:
                    item = "Paneer Rice";
                    price = 100;
                    break;

                case 3:
                    item = "Dal Rice";
                    price = 80;
                    break;

                case 4:
                    item = "Biryani";
                    price = 150;
                    break;

                case 0:
                    System.out.println("Thank you!");
                    return;

                default:
                    System.out.println("Invalid choice!");
                    continue;
            }

            System.out.print("Enter quantity: ");
            int quantity = sc.nextInt();

            int total = price * quantity;

            System.out.println("\n===== BILL =====");
            System.out.println("Item     : " + item);
            System.out.println("Price    : ₹" + price);
            System.out.println("Quantity : " + quantity);
            System.out.println("Total    : ₹" + total);
        }
    }
}