package kata.kyu_7;


public class GuavaAgainstMillionDollarError {
    public static void main(String[] args) {
        System.out.println(sum(2.0, -3.0));
    }

    public static Double sum(Double a, Double b) {
        if (a == null) {
            throw new NullPointerException("Illegal Argument passed: First parameter is Null.");
        }
        if (b == null) {
            throw new NullPointerException("Illegal Argument passed: Second parameter is Null.");
        }
        if (a <= 0) {
            throw new IllegalArgumentException(String.format("Illegal Argument passed: Non-positive value %s.",a));
        }
        if (b <= 0) {
            throw new IllegalArgumentException(String.format("Illegal Argument passed: Non-positive value %s.", b));
        }
        return a + b;
    }
}
