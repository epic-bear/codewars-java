package kata.kyu_7;

import java.util.Arrays;

public class MeanVsMedian {

    public static void main(String[] args) {
        System.out.println(meanVsMedian(new int[] {1, 2, 37}));
    }

    public static String meanVsMedian(int[] numbers) {
        Arrays.sort(numbers);
        double median = numbers[numbers.length / 2];
        double mean  = Arrays.stream(numbers).sum() / (double) numbers.length;

        return  median > mean ? "median" : mean > median ? "mean" : "same";
    }
}
