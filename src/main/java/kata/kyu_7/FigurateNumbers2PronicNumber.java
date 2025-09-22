package kata.kyu_7;

public class FigurateNumbers2PronicNumber {

  public static void main(String[] args) {
    System.out.println(isPronic(2));
  }

  public static boolean isPronic(int n) {
    int root = (int) Math.sqrt(n);
    return root * (root + 1) == n;
  }
}
