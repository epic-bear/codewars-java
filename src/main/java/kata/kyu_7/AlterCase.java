package kata.kyu_7;

public class AlterCase {

  public static void main(String[] args) {
    System.out.println(alternateCase("Hello World!"));
  }

  static String alternateCase(final String string) {
    return string.chars().map(x -> x = Character.isLowerCase(x) ? Character.toUpperCase(x) : Character.toLowerCase(x))
        .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
        .toString();
  }
}
