package kata.kyu_7;

public class CompleteThePattern4 {

  public static void main(String[] args) {
    System.out.println(pattern(5));
  }

  public static String pattern(int n) {
    if (n <= 0) return "";

    StringBuilder result = new StringBuilder();

    for (int i = 0; i < n; i++) {
      for (int j = i + 1; j <= n; j++) {
        result.append(j);
      }
      if (i < n - 1) result.append('\n');
    }

    return result.toString();
  }

}
