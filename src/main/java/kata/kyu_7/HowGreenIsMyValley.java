package kata.kyu_7;

import java.util.Arrays;
import java.util.stream.IntStream;


public class HowGreenIsMyValley {

  public static void main(String[] args) {
    System.out.println(Arrays.toString(makeValley(new int[]{19, 19, 18, 14, 12, 11, 9, 7, 4})));
  }

  public static int[] makeValley(int[] arr) {
    arr = IntStream.of(arr)
        .boxed()
        .sorted((a, b) -> b - a)
        .mapToInt(Integer::intValue)
        .toArray();

    int[] result = new int[arr.length];
    int index = 0;

    for (int i = 0; i < arr.length; i++) {
      result[index] = arr[i];
      if (index < result.length - 1 - index) {
        result[result.length - 1 - index] = arr[++i];
      }
      index++;
    }
    return result;
  }
}
