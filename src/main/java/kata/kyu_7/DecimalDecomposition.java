package kata.kyu_7;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class DecimalDecomposition {
    public static void main(String[] args) {
        System.out.println(decimalDecomposition(50069));
    }

    public static String decimalDecomposition(int number) {
        String[] digits = String.valueOf(number).split("");

        return IntStream.range(0, digits.length)
                .filter(i -> digits[i].charAt(0) != '0')
                .mapToObj(i -> digits[i] + "0".repeat(digits.length - i - 1))
                .collect(Collectors.joining("+"));
    }
}
