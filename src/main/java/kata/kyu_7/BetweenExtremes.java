package kata.kyu_7;

import java.util.Arrays;

public class BetweenExtremes {

    public static void main(String[] args) {
        System.out.println(betweenExtremes(new int[]{21, 34, 54, 43, 26, 12}));
    }

    public static int betweenExtremes(int[] numbers) {
        Arrays.sort(numbers);
        return numbers[numbers.length - 1] - numbers[0];
    }
}
