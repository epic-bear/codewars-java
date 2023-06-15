package kata.kyu_7;

import java.util.Arrays;

public class LatinSquares {

  public static void main(String[] args) {
    System.out.println(Arrays.deepToString(makeLatinSquare(4)));
  }

  public static int[][] makeLatinSquare(int n) {
    final int[][] latinSquare = new int[n][n];
    int count = 1;
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        latinSquare [i] [j] = count++;
        if (count > n){
          count = 1;
        }
      }
      count = i + 2;
    }
    return latinSquare;
  }
}
