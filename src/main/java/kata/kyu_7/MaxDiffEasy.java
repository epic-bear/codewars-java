package kata.kyu_7;

import java.util.Arrays;

public class MaxDiffEasy {

  public static void main(String[] args) {
    System.out.println(maxDiff(new int[]{1, 2, 3, 4, 5, 5, 4}));
  }

  public static int maxDiff(int[] lst) {
    Arrays.sort(lst);
    return lst.length < 2 ? 0 : lst[lst.length - 1] - lst[0];
  }
}
