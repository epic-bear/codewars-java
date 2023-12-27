package kata.kyu_7;

import java.util.Arrays;

public class CompoundArray {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(compoundArray(new int[]{0, 1, 2}, new int[]{9, 8, 7, 6, 5, 4, 3, 2, 1, 0})));
    }

    public static int[] compoundArray(int[] a, int[] b) {
        int[] result = new int[a.length + b.length];
        for (int i = 0, j = 0; i < result.length; j++) {
            if (j < a.length) result[i++] = a[j];
            if (j < b.length) result[i++] = b[j];
        }
        return result;
    }
}
