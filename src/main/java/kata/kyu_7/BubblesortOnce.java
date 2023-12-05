package kata.kyu_7;

import java.util.Arrays;

public class BubblesortOnce {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(bubbleSortOnce(new int[]{9, 7, 5, 3, 1, 2, 4, 6, 8})));
    }

    public static int[] bubbleSortOnce(int[] array) {
        int [] result = array.clone();

        for (int i = 0; i < result.length - 1; i++) {
            if (result[i] > result[i + 1]) {
                int x = result[i + 1];
                result[i + 1] = result[i];
                result[i] = x;
            }
        }
        return result;
    }
}
