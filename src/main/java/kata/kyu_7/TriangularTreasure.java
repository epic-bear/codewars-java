package kata.kyu_7;

public class TriangularTreasure {

  public static void main(String[] args) {

  }

  public static long triangular(long n) {
    return (n <= 0) ? 0 : n * (n + 1) / 2;
  }
}
