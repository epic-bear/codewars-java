package kata.kyu_7;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

public class FindCountOfMostFrequentItemInAnArray {

  public static void main(String[] args) {
    System.out.println(mostFrequentItemCount(new int[]{3, -1, -1}));
  }

  public static int mostFrequentItemCount(int[] collection) {
    return Arrays.stream(collection)
        .boxed()
        .collect(Collectors.groupingBy(i -> i, Collectors.counting()))
        .values()
        .stream()
        .map(Long::intValue)
        .max(Comparator.naturalOrder()).orElse(0);
  }
}
