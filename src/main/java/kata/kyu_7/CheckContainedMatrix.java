package kata.kyu_7;

import java.util.Arrays;

public class CheckContainedMatrix {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(checkIsContained(new int[][]{{4, 6, 7}, {0, 1, 6}, {2, 3, 5}},
                new int[][]{{6, 7, 9}, {0, 1, 6}, {2, 3, 5}})));
    }

    static int[] checkIsContained(int[][] mat1, int[][] mat2) {
        for (int i = 0; i < mat1.length - 2; i++) {
            for (int j = 0; j < mat1[i].length - 2; j++) {
                if (Arrays.equals(Arrays.copyOfRange(mat1[i], j, j + 3), mat2[0])) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{-1, -1};
    }
}
