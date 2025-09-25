package kata.kyu_7;

public class ArithmeticSequence {

  public static void main(String[] args) {
    System.out.println(nthterm(0, 55, 1));
  }

  public static int nthterm(int first, int n, int c) {
    return first + c * n;
  }
}
