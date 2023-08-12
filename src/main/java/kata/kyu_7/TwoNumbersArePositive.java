package kata.kyu_7;

import java.util.Arrays;

public class TwoNumbersArePositive {

  public static void main(String[] args) {
    System.out.println(twoArePositive(2, -4, -3));
  }

  public static boolean twoArePositive(int a, int b, int c) {
    return Arrays.stream(new int[]{a, b, c}).filter(x -> x > 0).count() == 2;
  }
}
