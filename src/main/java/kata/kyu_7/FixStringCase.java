package kata.kyu_7;

public class FixStringCase {

  public static void main(String[] args) {
    System.out.println(solve("COde"));
  }

  public static String solve(final String str) {
    int count = 0;
    for (int i = 0; i < str.length(); i++) {
      if (Character.isLowerCase(str.charAt(i))) {
        count++;
      }
    }
    return count >= str.length() - count ? str.toLowerCase() : str.toUpperCase();
  }
}
