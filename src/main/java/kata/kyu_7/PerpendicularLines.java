package kata.kyu_7;

public class PerpendicularLines {

  public static void main(String[] args) {
    System.out.println(maxBisectors(5));
  }

  public static int maxBisectors(int n) {
    return (int) (Math.ceil(n / 2.0) * Math.floor(n / 2.0));
  }
}
