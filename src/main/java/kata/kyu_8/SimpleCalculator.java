package kata.kyu_8;

public class SimpleCalculator {
    public static void main(String[] args) {
        System.out.printf(String.valueOf(calculate(1, 2, "f")));
    }

    public static double calculate(double a, double b, String op) {
        return switch (op) {
            case "+" -> a + b;
            case "-" -> a - b;
            case "*" -> a * b;
            case "/" -> a / b;
            default -> throw new IllegalArgumentException("Unknown operation: " + op);
        };
    }
}
