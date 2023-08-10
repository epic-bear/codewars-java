package kata.kyu_7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class UniqOrNotUniq {

  public static void main(String[] args) {
    System.out.println(Arrays.toString(testit(new int[]{1, 1, 1}, new int[]{2, 2, 2})));
  }

  public static int[] testit(int[] a, int[] b) {
    List<Integer> result = new ArrayList<>();
    Arrays.stream(a).distinct().forEach(result::add);
    Arrays.stream(b).distinct().forEach(result::add);
    Collections.sort(result);
    return result.stream().mapToInt(Integer::intValue).toArray();
  }
}
