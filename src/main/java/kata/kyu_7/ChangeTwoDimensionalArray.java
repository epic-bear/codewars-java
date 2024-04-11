package kata.kyu_7;

import java.util.Arrays;

public class ChangeTwoDimensionalArray {

    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(
                matrix(new int[][]{{-1, 4, -5, -9, 3}, {6, -4, -7, 4, -5}, {3, 5, 4, -9, -1}, {1, 5, -7, -8, -9},
                        {-3, 2, 1, -5, 6}})));
    }

    public static int[][] matrix(int[][] array) {
        for (int i = 0; i < array.length; i++) {
           array[i][i] = array[i][i] < 0 ? 0 : 1;
        }

        return array;
    }
}
