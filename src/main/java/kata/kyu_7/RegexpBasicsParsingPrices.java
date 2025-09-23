package kata.kyu_7;

public class RegexpBasicsParsingPrices {

  public static void main(String[] args) {
    System.out.println(toCents("$9.70"));
  }

  public static Integer toCents(String price) {
    if (price.matches("^\\$\\d+\\.\\d{2}$")) {
      return Integer.parseInt(price.substring(1).replaceAll("\\.", ""));
    }
    return null;
  }
}
