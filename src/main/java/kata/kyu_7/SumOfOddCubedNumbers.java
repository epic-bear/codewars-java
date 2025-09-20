package kata.kyu_7;

import java.util.Arrays;

public class SumOfOddCubedNumbers {

    public static void main(String[] args) {
        System.out.println(cubeOdd(new int[]{-5, -5, 5, 5}));
    }

    public static int cubeOdd(int[] arr) {
        return Arrays.stream(arr).filter(x -> x % 2 != 0).map(i -> (int) Math.pow(i, 3)).sum();
    }
}
