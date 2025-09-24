package kata.kyu_7;

public class PrincipalDiagonalVSSecondaryDiagonal {

  public static void main(String[] args) {
    System.out.println(diagonal(new int[][]{
        {2,2,2},
        {4,2,6},
        {8,8,2}}));
  }

  public static String diagonal(int[][] matrix) {
    int principalSum = 0;
    int secondarySum = 0;

    for (int i = 0; i < matrix.length; i++) {
       principalSum += matrix[i][i];
       secondarySum += matrix[i][matrix.length - 1 - i];
    }
    return principalSum > secondarySum ? "Principal Diagonal win!" :
        principalSum < secondarySum ? "Secondary Diagonal win!" : "Draw!";
  }
}
