
public class RD extends Banking {

    int durationMonths;
    double RdInterestRate = 0.06;
    double maturityAmount;

    public RD(String bankName, String accountHolder, long accNumber,
            String address, int amount, int durationMonths) {

        super(bankName, accountHolder, accNumber, address, amount);

        this.durationMonths = durationMonths;

        double totalDeposit = amount * durationMonths;
        double interest = totalDeposit * RdInterestRate;

        this.maturityAmount = totalDeposit + interest;
    }

    public void displayRD() {
        displayBank();
        System.out.println("Duration (Months): " + durationMonths);
        System.out.println("RD Interest Rate: " + RdInterestRate);
        System.out.println("Maturity Amount: " + maturityAmount);
    }
}
