
public class FD extends Banking {

    int durationYears;
    double FdInterestRate = 0.0625;
    double maturityAmount;

    public FD(String bankName, String accountHolder, long accNumber,
            String address, int amount, int durationYears) {

        super(bankName, accountHolder, accNumber, address, amount);

        this.durationYears = durationYears;

        double interest = amount * FdInterestRate * durationYears;
        this.maturityAmount = amount + interest;
    }

    public void displayFD() {
        displayBank();
        System.out.println("Duration (Years): " + durationYears);
        System.out.println("FD Interest Rate: " + FdInterestRate);
        System.out.println("Maturity Amount: " + maturityAmount);
    }
}
