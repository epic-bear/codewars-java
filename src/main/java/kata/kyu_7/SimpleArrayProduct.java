package kata.kyu_7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SimpleArrayProduct {

    public static void main(String[] args) {
        System.out.println(
                solve(new int[][]{{10, -8, 9, 15}, {2, 1, 11}, {13, -15, 9}, {-2, 17, 16, -20, 0}, {19, 18, -17}}));
    }

    public static int solve(int[][] arr) {
        List<Integer> result = new ArrayList<>();
        Arrays.sort(arr[0]);
        result.add(arr[0][0]);
        result.add(arr[0][arr[0].length - 1]);

        for (int i = 1; i < arr.length; i++) {
            List<Integer> variants = new ArrayList<>();
            Arrays.sort(arr[i]);
            int min = arr[i][0];
            int max = arr[i][arr[i].length - 1];
            for (int x : result) {
                variants.add(x * min);
                variants.add(x * max);
            }
            result = variants;
        }
        return result.stream().max(Comparator.naturalOrder()).orElse(0);
    }
}
