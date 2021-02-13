package kata.kyu_8;

import java.util.Arrays;

public class SumArrays {

  public static void main(String[] args) {

  }

  public static double getSum(double[] array) {

    return Arrays.stream(array).sum();
  }
}
