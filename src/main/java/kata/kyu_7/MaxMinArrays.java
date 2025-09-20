package kata.kyu_7;

import java.util.Arrays;

public class MaxMinArrays {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solve(new int[]{15, 11, 10, 7, 12})));
    }

    public static int[] solve(int[] arr) {
        int[] result = new int[arr.length];
        Arrays.sort(arr);
        for (int i = 0, j = 0; i <= arr.length / 2 && j < result.length; i++) {
            result[j] = arr[arr.length - i - 1];
            if (j < result.length - 1) {
                result[j + 1] = arr[i];
                j += 2;
            }
        }
        return result;
    }
}
