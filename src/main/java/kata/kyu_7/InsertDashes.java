package kata.kyu_7;

public class InsertDashes {

  public static void main(String[] args) {
    System.out.println(insertDash(454793));
  }

  public static String insertDash(int num) {
  return Integer.toString(num).replaceAll("[13579](?=[13579])", "$0-");
  }
}
