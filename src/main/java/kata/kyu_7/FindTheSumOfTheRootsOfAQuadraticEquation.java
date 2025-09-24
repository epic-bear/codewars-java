package kata.kyu_7;

import java.util.OptionalDouble;

public class FindTheSumOfTheRootsOfAQuadraticEquation {

  public static void main(String[] args) {
    System.out.println(roots(8, 47, 41));
  }

  public static OptionalDouble roots(double a, double b, double c) {
    return b * b - 4 * a * c < 0 ? OptionalDouble.empty() : OptionalDouble.of(-b / a);
  }
}
