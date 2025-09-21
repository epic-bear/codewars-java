package kata.kyu_7;

import java.util.Arrays;

public class SumOfTwoLowestPositiveIntegers {

  public static void main(String[] args) {
    System.out.println(sumTwoSmallestNumbers(new long[]{5, 8, 12, 19, 22}));
  }

  public static long sumTwoSmallestNumbers(long[] numbers) {
    return Arrays.stream(numbers).sorted().limit(2).sum();
  }
}
