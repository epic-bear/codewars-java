package kata.kyu_7;

import java.util.Arrays;

public class BasicSequencePractice {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(sumOfN(3)));
    }

    public static int[] sumOfN(int n) {
        int[] result = new int[Math.abs(n) + 1];

        if (n >= 0) {
            for (int i = 1; i < result.length; i++) {
                for (int j = 0; j < i; j++) {
                    result[i] += j;
                }
                result[i] += i;
            }
        } else {
            for (int i = 1; i < result.length; i++) {
                for (int j = 0; j < i; j++) {
                    result[i] -= j;
                }
                result[i] -= i;
            }
        }

        return result;
    }
}
