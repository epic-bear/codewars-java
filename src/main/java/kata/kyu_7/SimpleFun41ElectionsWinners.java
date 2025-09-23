package kata.kyu_7;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SimpleFun41ElectionsWinners {

  public static void main(String[] args) {
    System.out.println(find(new int[]{1, 3, 3, 1, 1}, 0));
  }

  static int find(final int[] votes, final int k) {
    Map<Integer, Integer> counts = new HashMap<>();

    int max = Arrays.stream(votes).peek(x -> {
      if (counts.containsKey(x)) {
        counts.replace(x, counts.get(x) + 1);
      } else {
        counts.put(x, 1);
      }
    }).max().orElse(0);

    int count = (int) Arrays.stream(votes).filter(x -> x + k > max).count();
    return count > 0 ? count : counts.get(max) == 1 ? 1 : 0;
  }
}
