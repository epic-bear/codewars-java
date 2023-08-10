package kata.kyu_7;

public class FilterTheNumber {

  public static void main(String[] args) {
    System.out.println(filterString("aa1bb2cc3dd"));
  }

  public static long filterString(final String value) {
    return Long.parseLong(value.replaceAll("\\D", ""));
  }
}
