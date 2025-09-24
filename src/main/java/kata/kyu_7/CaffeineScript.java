package kata.kyu_7;

public class CaffeineScript {

  public static void main(String[] args) {
    System.out.println(caffeineBuzz(12));
  }

  public static String caffeineBuzz(int n) {
    String result = "";

    if (n % 3 == 0) {
      if (n % 4 == 0) {
        result += "Coffee";
      } else {
        result += "Java";
      }
    }

    if (!result.isEmpty() && n % 2 == 0) {
      result += "Script";
    }

    return result.isEmpty() ? "mocha_missing!" : result;
  }
}
