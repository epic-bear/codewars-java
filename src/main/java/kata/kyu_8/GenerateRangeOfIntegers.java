package kata.kyu_8;

import java.util.Arrays;

import static java.util.stream.IntStream.range;

public class GenerateRangeOfIntegers {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(generateRange(1, 15, 20)));
    }

    public static int[] generateRange(int min, int max, int step) {
        return range(min, ++max).filter(x -> (x - min) % step == 0).toArray();
    }
}
