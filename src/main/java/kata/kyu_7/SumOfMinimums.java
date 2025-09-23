package kata.kyu_7;

import java.util.Arrays;

public class SumOfMinimums {

  public static void main(String[] args) {
    System.out.println(sumOfMinimums(new int[][]{{7, 9, 8, 6, 2}, {6, 3, 5, 4, 3}, {5, 8, 7, 4, 5}}));
  }

  public static int sumOfMinimums(int[][] arr){
    return Arrays.stream(arr).mapToInt(row -> Arrays.stream(row).min().orElse(0)).sum();
  }
}
