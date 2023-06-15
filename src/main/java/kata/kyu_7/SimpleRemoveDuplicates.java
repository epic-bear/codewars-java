package kata.kyu_7;

import java.util.Arrays;
import java.util.stream.IntStream;

public class SimpleRemoveDuplicates {

  public static void main(String[] args) {
    System.out.println(Arrays.toString(solve(new int[]{3, 4, 4, 3, 6, 3})));
  }

  public static int [] solve(int [] arr){
      int [] result = IntStream.range(0, arr.length).map(x -> arr[arr.length - x - 1]).distinct().toArray();
      return IntStream.range(0, result.length).map(x -> result[result.length - x - 1]).distinct().toArray();
  }
}
