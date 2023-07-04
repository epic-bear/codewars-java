package kata.kyu_7;

import java.util.Arrays;

public class LargestElements {

  public static void main(String[] args) {
    System.out.println(Arrays.toString(largest(2, new int[]{7, 6, 5, 4, 3, 2, 1})));
  }

  public static int[] largest(int n, int[] arr) {
    return Arrays.stream(arr).sorted()
                             .skip(arr.length - n)
                             .toArray();
  }
}
