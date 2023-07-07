package kata.kyu_7;

import java.util.Arrays;
import java.util.Comparator;

public class DescendingOrder {

  public static void main(String[] args) {
    System.out.println(sortDesc(42145));
  }

  public static int sortDesc(final int num) {
    String[] digits = String.valueOf(num).split("");
    Arrays.sort(digits, Comparator.reverseOrder());

    return Integer.parseInt(String.join("", digits));
  }
}
