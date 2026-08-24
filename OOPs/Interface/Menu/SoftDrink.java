import java.util.Scanner;

public class SoftDrink implements FoodMenu {

    Scanner sc = new Scanner(System.in);

    @Override
    public void displayMenu() {

        while (true) {

            System.out.println("\n===== SOFT DRINK MENU =====");
            System.out.println("1. Coca Cola - ₹40");
            System.out.println("2. Pepsi     - ₹40");
            System.out.println("3. Sprite    - ₹35");
            System.out.println("4. Fanta     - ₹35");
            System.out.println("0. Exit");

            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            String item = "";
            int price = 0;

            switch (choice) {

                case 1:
                    item = "Coca Cola";
                    price = 40;
                    break;

                case 2:
                    item = "Pepsi";
                    price = 40;
                    break;

                case 3:
                    item = "Sprite";
                    price = 35;
                    break;

                case 4:
                    item = "Fanta";
                    price = 35;
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