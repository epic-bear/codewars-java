package kata.kyu_7;

public class TrueOrFalse {

  public static void main(String[] args) {
    System.out.println(testTrueFalse(8));
  }

  public static int testTrueFalse(int n) {
    return Integer.bitCount(n);
  }
}
