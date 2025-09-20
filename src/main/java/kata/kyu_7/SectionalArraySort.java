package kata.kyu_7;

import java.util.Arrays;

public class SectionalArraySort {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(
                sort(new int[]{626202, 45233, 116798, 152838, 154416, 241376, 250976, 475793, 649415, 744130, 773646,
                        656730}, 2, 9)));
    }

    static int[] sort(final int[] array, final int start, final int... length) {
        Arrays.sort(array, start,
                length.length > 0 && start + length[0] < array.length ? start + length[0] : array.length);
        return array;
    }
}
