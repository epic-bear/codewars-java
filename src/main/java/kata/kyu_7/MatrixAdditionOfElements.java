package kata.kyu_7;

import java.util.Arrays;

public class MatrixAdditionOfElements {

  public static void main(String[] args) {
    System.out.println(sumOfElements(new int[][]{{1,0},{0,1}}));
  }

  public static int sumOfElements(int[][] matrix) {
    return Arrays.stream(matrix).flatMapToInt(Arrays::stream).sum();
  }
}
