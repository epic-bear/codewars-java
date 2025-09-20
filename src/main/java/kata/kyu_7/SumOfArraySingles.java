package kata.kyu_7;

import java.util.Arrays;

public class SumOfArraySingles {

    public static void main(String[] args) {
        System.out.println(repeats(new int[]{4, 5, 7, 5, 4, 8}));
    }

    public static int repeats(int[] arr) {
        return Arrays.stream(arr).filter(x -> Arrays.stream(arr).filter(y -> y == x).count() == 1).sum();
    }
}
