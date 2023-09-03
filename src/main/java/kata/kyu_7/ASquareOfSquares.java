package kata.kyu_7;

public class ASquareOfSquares {

  public static void main(String[] args) {
    System.out.println(isSquare(4));
  }

  public static boolean isSquare(int n) {
    return Math.sqrt(n) % 1 == 0;
  }
}
