package kata.kyu_7;

import java.util.Arrays;
import java.util.Comparator;

public class TwoOldestAges {

  public static void main(String[] args) {
    System.out.println(Arrays.toString(twoOldestAges((new int[]{1, 5, 87, 45, 8, 8}))));
  }

  public static int[] twoOldestAges(int[] ages) {
    return Arrays.stream(ages)
        .boxed()
        .sorted(Comparator.reverseOrder()).limit(2).sorted()
        .mapToInt(Integer::intValue).toArray();
  }
}
