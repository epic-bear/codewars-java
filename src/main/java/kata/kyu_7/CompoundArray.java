package kata.kyu_7;

import java.util.Arrays;

public class CompoundArray {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(compoundArray(new int[]{1, 2, 3, 4, 5, 6}, new int[]{9, 8, 7, 6})));
    }

    public static int[] compoundArray(int[] a, int[] b) {
        int[] result = new int[a.length + b.length];
        int[] min = Math.min(a.length, b.length) == a.length ? a : b;
        int[] max = Math.max(a.length, b.length) == a.length ? a : b;

        for (int j = 0, i = 0; j < max.length; i += 2, j++) {
            if (j < min.length) {
                result[i] = a[j];
                result[i + 1] = b[j];
            } else {
                result[i] = max[j];
                result[i + 1] = max[++j];
            }
        }
        return result;
    }
}
