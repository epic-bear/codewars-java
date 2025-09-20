package kata.kyu_7;

public class PizzaPayment {

    public static void main(String[] args) {
        System.out.println(michaelPays(80));
    }

    public static double michaelPays(double cost) {
        return Math.round((cost < 5 ? cost : cost / 3 <= 10 ? cost * 2 / 3 : cost - 10) * 100) / 100.;
    }
}
