package kata.kyu_7;

import java.util.function.IntUnaryOperator;

public class FunctionalAddition {

    public static void main(String[] args) {
    }

    public static IntUnaryOperator add(int n) {
        return (x) -> x + n;
    }
}
