package kata.kyu_7;

public class IWillTakeTheBiggestOneAndNothingElse {

  public static void main(String[] args) {
    System.out.println(maxIntChain(39));
  }

  public static long maxIntChain(long n) {
    return n < 5 ? -1 : (n - 1) / 2 * (n / 2 + 1);
  }
}
