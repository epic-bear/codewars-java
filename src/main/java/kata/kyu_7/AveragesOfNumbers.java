package kata.kyu_7;

import java.util.Arrays;
import java.util.stream.IntStream;

public class AveragesOfNumbers {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(averages(new int[]{1, 3, 5, 1, -10})));
    }

    public static double[] averages(int[] numbers) {
        return numbers != null ? IntStream.range(0, numbers.length - 1)
                .mapToDouble(x -> (numbers[x] + numbers[x + 1]) / 2.).toArray() : new double[0];
    }
}
