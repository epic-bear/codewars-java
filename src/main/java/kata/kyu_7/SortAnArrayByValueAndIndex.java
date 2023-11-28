package kata.kyu_7;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.IntStream;

public class SortAnArrayByValueAndIndex {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(sortByValueAndIndex(new int[]{-3, -3, -9})));
    }

    public static int[] sortByValueAndIndex(int[] array) {
        return IntStream.range(0, array.length)
                .boxed()
                .sorted(Comparator.comparingInt(i -> array[i] * (i + 1)))
                .mapToInt(Integer::intValue).toArray();
    }
}
