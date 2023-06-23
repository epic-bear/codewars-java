package kata.kyu_7;

public class MatrixWeight {

  public static void main(String[] args) {
    System.out.println(thinOrFat(new int[][]{{-1, 1, 1}, {-1, 1, 1}, {1, 1, 1}}));
  }

  public static String thinOrFat(int[][] matrix) {
    double width = 0;
    double height = 0;

    for (int i = 0; i < matrix.length; i++) {
      double columnHeight = 0;
      double rawWidth = 0;

      for (int j = 0; j < matrix[i].length; j++) {
        rawWidth += matrix[i][j];
        columnHeight += matrix[j][i];
      }
      width += Math.sqrt(rawWidth);
      height += Math.sqrt(columnHeight);
    }

    if (width > height) {
      return "fat";
    }
    if (width < height) {
      return "thin";
    }
    if (width == height) {
      return "perfect";
    }
    return null;
  }
}


