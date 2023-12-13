package kata.kyu_7;

import java.util.stream.IntStream;

public class SumOfDifferencesBetweenProductsAndLCMs {

    public static void main(String[] args) {
        System.out.println(sumDifferencesBetweenProductsAndLCMs(new int[][]{{1, 1}, {0, 0}, {13, 91}}));
    }

    public static int sumDifferencesBetweenProductsAndLCMs(final int[][] pairs) {
        int result = 0;
        for (int i = 0; i < pairs.length; i++) {
            int j = i;

            int gcd = IntStream.range(1, Math.min(pairs[i][0], pairs[i][1]) + 1)
                    .filter(x -> pairs[j][0] % x == 0 && pairs[j][1] % x == 0).max().orElse(1);

            result += gcd == 0 ? 0 : pairs[i][0] * pairs[i][1] - pairs[i][0] * pairs[i][1] / gcd;
        }
        return result;
    }
}
