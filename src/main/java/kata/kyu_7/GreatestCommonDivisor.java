package kata.kyu_7;

public class GreatestCommonDivisor {

  public static void main(String[] args) {
    System.out.println(compute(30,12));
  }

  public static int compute(int x, int y) {
    return (x % y != 0) ? compute(y, x % y) : y;
  }
}
