package ExceptionHandling.customException;

import ExceptionHandling.customException.exception.*;
import ExceptionHandling.customException.model.*;
import ExceptionHandling.customException.service.*;

public class BankMain {

    public static void main(String[] args) {

        BankService service = new BankService();

        // create acc
        try {
            service.createAccount(1001, "Amit", 50000);
        } catch (Exception e) {
            System.out.println("Account Error : " + e.getMessage());

        }

        // depsoit
        try {
            service.deposit(15000);
        } catch (Exception e) {
            System.out.println("Deposit Error : " + e.getMessage());
        }

        // withdraw
        try {
            service.withdraw(30000);
        } catch (Exception e) {
            System.out.println("Withdrawal Error : " + e.getMessage());
        }

        service.showAcc();
    }

}
