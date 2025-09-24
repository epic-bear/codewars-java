package kata.kyu_7;

public class ASnailEntersABar {

  public static void main(String[] args) {
    System.out.println(canSnailReachEnd(100, 10, 5));
  }

  public static boolean canSnailReachEnd(double length, double speed, double lengthIncreases) {
    int minutesToYear = 60 * 24 * 365;
    return speed * minutesToYear >= length + lengthIncreases * minutesToYear;
  }
}
