package kata.kyu_7;

import java.util.Arrays;

public class HowManyConsecutiveNumbersAreNeeded {

  public static void main(String[] args) {
    System.out.println(consecutive(new int[]{4, 8, 6}));
  }

  public static int consecutive(final int[] arr) {
    int count = 0;
    Arrays.sort(arr);

    for (int i = 0; i < arr.length - 1; i++) {
      if (arr[i + 1] - arr[i] > 1) {
        count += arr[i + 1] - arr[i] - 1;
      }
    }
    return count;
  }
}
