package kata.kyu_7;

import java.util.Arrays;

public class ParallelResistors {

    public static void main(String[] args) {
        System.out.println(resistance(20, 20));
    }

    public static double resistance(int ... r) {
      return 1 / Arrays.stream(r).mapToDouble(x -> 1. / x).sum();
    }
}
