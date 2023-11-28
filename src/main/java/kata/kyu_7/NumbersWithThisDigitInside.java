package kata.kyu_7;

import java.util.Arrays;

public class NumbersWithThisDigitInside {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(NumbersWithDigitInside(11, 1)));
    }

    public static long[] NumbersWithDigitInside(long x, long d) {
        long[] result = new long[3];

        for (int i = 1; i <= x; i++) {
            if (String.valueOf(i).contains(String.valueOf(d))) {
                result[0]++;
                result[1] += i;
                if (result[2] == 0) {
                    result[2] = i;
                } else {
                    result[2] *= i;
                }
            }
        }
        return result;
    }
}
