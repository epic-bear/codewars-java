package kata.kyu_7;

public class Divisible {

  public static void main(String[] args) {
    System.out.println(isDivisible(4, 4, 2, 4, 3));
  }

  public static boolean isDivisible(int... n) {
    for (int i : n) {
      if (n[0] % i != 0) {
        return false;
      }
    }
    return true;
  }
}
