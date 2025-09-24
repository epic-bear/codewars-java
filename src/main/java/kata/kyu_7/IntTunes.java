package kata.kyu_7;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class IntTunes {

  public static void main(String[] args) {
    System.out.println(isTune(new int[]{1, 3, 6, 8, 10, 12}));
  }

  public static boolean isTune(int[] notes) {
    List<Integer> tunes = List.of(-10, -8, -6, -5, -3, -1, 0, 2, 4, 5, 6, 7, 9, 11);

    return notes != null && IntStream.of(notes)
        .mapToObj(pivot -> IntStream.of(notes)
             .map(n -> (n - pivot) % 12)
             .boxed().collect(Collectors.toList()))
        .anyMatch(tunes::containsAll);
  }

}
