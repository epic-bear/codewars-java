package kata.kyu_7;

import java.util.Comparator;

public class The12DaysOfChristmas {

  public static void main(String[] args) {

  }

  public static class HelpSaveChristmas implements Comparator<String> {

    @Override
    public int compare(final String line1, final String line2) {
      String subLine1 = line1.substring(0, 2).trim();
      String subLine2 = line2.substring(0, 2).trim();
      if (subLine1.equals("On")) {
        return -1;
      }
      if (subLine2.equals("On")) {
        return 1;
      }
      if (subLine1.equals("a")) {
        return 1;
      }
      if (subLine2.equals("a")) {
        return -1;
      }
      return Integer.parseInt(subLine2) - Integer.parseInt(subLine1);
    }
  }
}
