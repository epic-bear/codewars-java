package kata.kyu_7;

import java.util.Arrays;
import java.util.stream.IntStream;

public class SplitByValue {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(splitByValue(5, new int[]{1, 3, 5, 7, 6, 4, 2})));
    }

    static int[] splitByValue(int k, int[] elements) {
        return IntStream.concat(Arrays.stream(elements).filter(x -> x < k), Arrays.stream(elements).filter(x -> x >= k))
                .toArray();
    }
}
