package kata.kyu_7;

import java.util.Arrays;

public class BlowingBirthdayCandles {

    public static void main(String[] args) {
        System.out.println(blowCandles("0323456"));
    }

    public static int blowCandles(String str) {
        int count = 0;
        if (!str.isEmpty()) {
            int[] numbers = Arrays.stream(str.split("")).mapToInt(Integer::parseInt).toArray();

            for (int i = 0; i < numbers.length; i++) {
                while (numbers[i] > 0) {
                    numbers[i]--;
                    if (i + 1 < numbers.length) {
                        numbers[i + 1]--;
                    }
                    if (i + 2 < numbers.length) {
                        numbers[i + 2]--;
                    }
                    count++;
                }

            }
        }
        return count;
    }
}
