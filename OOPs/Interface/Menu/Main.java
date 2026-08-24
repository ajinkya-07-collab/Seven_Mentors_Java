import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter current time (0-23): ");
        int time = sc.nextInt();

        FoodMenu menu;

        if (time < 11) {

            menu = new Breakfast();

        } else if (time <= 16) {

            menu = new Lunch();

        } else {

            menu = new SoftDrink();
        }

        menu.displayMenu();

        sc.close();
    }
}