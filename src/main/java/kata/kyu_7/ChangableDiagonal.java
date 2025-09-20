package kata.kyu_7;

public class ChangableDiagonal {

  public static void main(String[] args) {
    System.out.println(matrixDiagonal(new int[][]{{1, 2}, {3, 4}}, 1));
  }

  public static int matrixDiagonal(int[][] matrix, int value) {
    int res = 0;
    int i = 0;
    int j = 0;

    if (value > 0) {
      i = value;
    } else if (value < 0) {
      j = Math.abs(value);
    }

    while (i < matrix.length && j < matrix[0].length) {
      res += matrix[i++][j++];
    }
    return res;
  }
}
