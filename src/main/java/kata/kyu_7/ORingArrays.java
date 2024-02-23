package kata.kyu_7;

import java.util.Arrays;

public class ORingArrays {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(orArrays(new int[]{1, 2, 3}, new int[]{1, 2, 3}, 4)));
    }

    public static int[] orArrays(int[] arr1, int[] arr2, int... param) {
        int[] result = new int[Math.max(arr1.length, arr2.length)];
        int x = param.length == 0 ? 0 : param[0];
        for (int i = 0; i < result.length; i++) {
            int a = i >= arr1.length ? x : arr1[i];
            int b = i >= arr2.length ? x : arr2[i];

            result[i] = a | b;
        }
        return result;
    }
}
