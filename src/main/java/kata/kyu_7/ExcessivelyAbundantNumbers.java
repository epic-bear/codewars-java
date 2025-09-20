package kata.kyu_7;

import java.util.stream.IntStream;

public class ExcessivelyAbundantNumbers {

    public static void main(String[] args) {
        System.out.println(abundantNumber(12));
    }

    public static boolean abundantNumber(int num) {
        return IntStream.range(1, num - 1).filter(x -> num % x == 0).sum() > num;
    }
}
