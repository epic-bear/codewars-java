package kata.kyu_7;

import java.util.Arrays;

public class OddMarchBits8Bits {

  public static void main(String[] args) {
    System.out.println(Arrays.deepToString(BitMarch(7)));
  }

  public static int[][] BitMarch(int n) {
    int[][] result = new int[9 - n][8];
    int start = 0;
    for (int i = 0; i < result.length; i++) {
      int count = n;
      for (int j = 7 - start; j >= 0; j--) {
        if (count > 0) {
          result[i][j] = 1;
          count--;
        } else {
          result[i][j] = 0;
        }

      }
      start++;
    }
    return result;
  }
}
