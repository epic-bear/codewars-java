package kata.kyu_7;

import java.util.Arrays;

public class TheHighestProfitWins {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(minMax(new int[]{1, 2, 3, 4, 5})));
    }

    public static int[] minMax(int[] arr) {
        int[] result = new int[2];

        Arrays.sort(arr);
        result[0] = arr[0];
        result[1] = arr[arr.length - 1];

        return result;
    }
}
