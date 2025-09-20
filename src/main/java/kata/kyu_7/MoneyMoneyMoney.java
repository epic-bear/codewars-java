package kata.kyu_7;

public class MoneyMoneyMoney {

    public static void main(String[] args) {
        System.out.println(calculateYears(1000,0.05,0.18,1100));
    }

    public static int calculateYears(double principal, double interest,  double tax, double desired) {
        int result = 0;

        while (principal < desired) {
            double yearProfit = principal * interest;
            principal += yearProfit - yearProfit * tax;
            result++;
        }

        return result;
    }
}
