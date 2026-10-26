@FunctionalInterface
interface BonusEligibility {
    boolean isEligible(double performanceScore);
}

public class FI_EmployeeBonus {

    public static void main(String[] args) {
        BonusEligibility bonusRule = (score) -> (score >= 80.0);

        System.out.println(bonusRule.isEligible(90));
        System.out.println(bonusRule.isEligible(87.60));
        System.out.println(bonusRule.isEligible(40));

    }

}
