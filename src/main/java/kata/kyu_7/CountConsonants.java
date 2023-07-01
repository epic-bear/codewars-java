package kata.kyu_7;

public class CountConsonants {

  public static void main(String[] args) {
    System.out.println(getCount("helLo world"));
  }

  public static int getCount(String str) {
    return str.toLowerCase().replaceAll("[^qwrtypsdfghjklzxcvbnm]", "").length();
  }
}
