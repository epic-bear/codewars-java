package kata.kyu_7;

public class TheWheatRiceAndChessboardProblem {

  public static void main(String[] args) {
    System.out.println(squaresNeeded(100));
  }

  public static int squaresNeeded(long grains) {
    return grains != 0 ? Long.toBinaryString(grains).length() : 0;
  }
}
