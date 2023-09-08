package kata.kyu_7;

import java.util.*;

public class HighestAndLowest {

  public static void main(String[] args) {
    System.out.println(highAndLow("8 3 -5 42 -1 0 0 -9 4 7 4 -4"));
  }

  public static String highAndLow(String numbers) {
    int min = Arrays.stream(numbers.split(" ")).mapToInt(Integer::parseInt).min().orElse(0);
    int max = Arrays.stream(numbers.split(" ")).mapToInt(Integer::parseInt).max().orElse(0);
    return String.format("%d %d", max, min);
  }
}
