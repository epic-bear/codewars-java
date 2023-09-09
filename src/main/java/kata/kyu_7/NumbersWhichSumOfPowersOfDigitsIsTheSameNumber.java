package kata.kyu_7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NumbersWhichSumOfPowersOfDigitsIsTheSameNumber {

  public static void main(String[] args) {
    System.out.println(Arrays.toString(eqSumPowDig(200, 3)));
  }

  public static long[] eqSumPowDig(long hmax, int exp) {
    List<Long> result = new ArrayList<>();
    for (long i = 153; i <= hmax; i++) {
      long sum = Arrays.stream(String.valueOf(i).split(""))
          .mapToInt(Integer::parseInt)
          .map(x -> (int) Math.pow(x, exp)).sum();
      if (sum == i) {
        result.add(i);
      }
    }
    return result.stream().mapToLong(Long::longValue).toArray();
  }
}
