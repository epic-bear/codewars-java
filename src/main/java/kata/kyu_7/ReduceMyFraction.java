package kata.kyu_7;

import java.util.Arrays;

public class ReduceMyFraction {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(myFraction(new int[]{45, 120})));
    }

    public static int[] myFraction(int[] fractions) {
        for (int i = Arrays.stream(fractions).min().orElse(0); i >= 1; i--) {
            if (fractions[0] % i == 0 && fractions[1] % i == 0) {
                fractions[0] /= i;
                fractions[1] /= i;
            }

        }
        return fractions;
    }
}
