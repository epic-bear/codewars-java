package kata.kyu_7;

import java.util.Arrays;

public class StantonMeasure {

  public static void main(String[] args) {
    System.out.println(stantonMeasure(new int[]{1, 4, 1, 2, 11, 2, 3, 1}));
  }

  public static int stantonMeasure(int[] arr) {
    return (int) Arrays.stream(arr).filter(x -> x == Arrays.stream(arr).filter(y -> y == 1).count())
        .count();
  }
}
