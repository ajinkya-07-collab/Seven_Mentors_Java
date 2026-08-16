import java.util.Scanner;

public class MainBank {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int choice;

        do {
            System.out.println("\n===== BANKING MENU =====");
            System.out.println("1. Fixed Deposit (FD)");
            System.out.println("2. Recurring Deposit (RD)");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.println("\n--- FD Details ---");

                    System.out.print("Enter Bank Name: ");
                    String fdBankName = sc.next();

                    System.out.print("Enter Account Holder: ");
                    String fdAccountHolder = sc.next();

                    System.out.print("Enter Account Number: ");
                    long fdAccNumber = sc.nextLong();

                    System.out.print("Enter Address: ");
                    String fdAddress = sc.next();

                    System.out.print("Enter Amount: ");
                    int fdAmount = sc.nextInt();

                    System.out.print("Enter Duration (Years): ");
                    int durationYears = sc.nextInt();

                    FD fd = new FD(
                            fdBankName,
                            fdAccountHolder,
                            fdAccNumber,
                            fdAddress,
                            fdAmount,
                            durationYears);

                    fd.displayFD();
                    break;

                case 2:
                    System.out.println("\n--- RD Details ---");

                    System.out.print("Enter Bank Name: ");
                    String rdBankName = sc.next();

                    System.out.print("Enter Account Holder: ");
                    String rdAccountHolder = sc.next();

                    System.out.print("Enter Account Number: ");
                    long rdAccNumber = sc.nextLong();

                    System.out.print("Enter Address: ");
                    String rdAddress = sc.next();

                    System.out.print("Enter Monthly Amount: ");
                    int rdAmount = sc.nextInt();

                    System.out.print("Enter Duration (Months): ");
                    int durationMonths = sc.nextInt();

                    RD rd = new RD(
                            rdBankName,
                            rdAccountHolder,
                            rdAccNumber,
                            rdAddress,
                            rdAmount,
                            durationMonths);

                    rd.displayRD();
                    break;

                case 0:
                    System.out.println("Thank you! Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice! Please try again.");
            }

        } while (choice != 0);

        sc.close();
    }
}