package kata.kyu_7;

public class TreasureHuntWithClues {

  public static void main(String[] args) {
    final int[][] grid1 = {{34, 21, 32, 44, 25}, {21, 41, 43, 14, 31}, {31, 45, 52, 42, 23},
        {33, 15, 51, 44, 35}, {21, 52, 33, 13, 44}};
    System.out.println(findTreasure(grid1, 3, 4));
  }

  public static int findTreasure(int[][] grid, int row, int col) {
    while (true) {
      int number = grid[row - 1][col - 1];
      if (number == row * 10 + col) {
        return number;
      } else {
        row = number / 10;
        col = number % 10;
      }
    }
  }
}
