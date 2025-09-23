package kata.kyu_7;

import java.util.Arrays;

public class EvenNumbersInAnArray {

  public static void main(String[] args) {
    System.out.println(Arrays.toString(evenNumbers(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9}, 3)));
  }

  public static int[] evenNumbers(int[] arr, int n){
    int[] result = new int[n];

    for (int i = arr.length - 1; i >= 0; i--) {
      if (arr[i] % 2 == 0) {
        result[n-- - 1] = arr[i];
        if (n < 1) {
          break;
        }
      }
    }
    return result;
  }
}
