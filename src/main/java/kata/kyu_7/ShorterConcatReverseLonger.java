package kata.kyu_7;

public class ShorterConcatReverseLonger {

  public static void main(String[] args) {
    System.out.println(shorterReverseLonger("first", "abcde"));
  }

  public static String shorterReverseLonger(String a, String b) {
    return a.length() >= b.length() ? b + new StringBuilder(a).reverse() + b :
        a + new StringBuilder(b).reverse() + a;
  }
}
