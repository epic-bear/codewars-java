package kata.kyu_7;

import java.util.stream.IntStream;

public class AlternateSquareSum {

    public static void main(String[] args) {
        System.out.println(alternateSqSum(new int[]{11, 12, 13, 14, 15}));
    }

    public static int alternateSqSum(int[] arr) {
        return IntStream.range(0, arr.length).map(i -> i % 2 != 0 ? arr[i] * arr[i] : arr[i]).sum();
    }
}
