package kata.kyu_7;

import java.util.stream.IntStream;

public class FindSumOfTopLeftToBottomRightDiagonals {

  public static void main(String[] args) {
    System.out.println(diagonalSum(new int[][]{{1, 2}, {3, 4}}));
  }

  public static int diagonalSum(final int[][] matrix) {
    return IntStream.range(0, matrix.length).map(x -> matrix[x][x]).sum();
  }
}
