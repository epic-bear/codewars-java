package kata.kyu_7;

public class SimpleFun176ReverseLetter {

  public static void main(String[] args) {
    System.out.println(reverseLetter("nahsirk"));
  }

  public static String reverseLetter(final String str) {
    return new StringBuilder(str.replaceAll("[^A-Za-z]", "")).reverse().toString();
  }
}
