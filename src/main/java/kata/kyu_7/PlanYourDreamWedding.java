package kata.kyu_7;

public class PlanYourDreamWedding {

    public static void main(String[] args) {
        System.out.println(maxWeddingCost(2_500, 0.5, 3_000_000, 35, 5));
    }

    public static double calculateTotalSavingsAtTime(double initialPrincipal, double monthlyInterestRate, double monthlyDeposit, int timeMonths) {
        return monthlyDeposit * ((Math.pow(1 + monthlyInterestRate, timeMonths) - 1) / monthlyInterestRate) + initialPrincipal * Math.pow(1 + monthlyInterestRate, timeMonths);
    }

    public static double calculateRequiredPrincipal(double targetSavings, double monthlyInterestRate, double monthlyDeposit, int timeMonths) {
        return (targetSavings - monthlyDeposit * ((Math.pow(1 + monthlyInterestRate, timeMonths) - 1) / monthlyInterestRate)) / Math.pow(1 + monthlyInterestRate, timeMonths);
    }

    public static double maxWeddingCost(int C, double r, int S, int T, int W) {
        double savingsAtWedding = calculateTotalSavingsAtTime(0, r / 100, C, 12 * W);
        double remainingSavingsNeeded = calculateRequiredPrincipal(S, r / 100, C, 12 * (T - W));
        return savingsAtWedding - Math.max(0, remainingSavingsNeeded);
    }
}
