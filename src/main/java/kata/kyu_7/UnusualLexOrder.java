package kata.kyu_7;

import java.util.Arrays;
import java.util.Comparator;

public class UnusualLexOrder {

  public static void main(String[] args) {
    System.out.println(
        Arrays.toString(unusualLexOrder(new String[]{"nigeb", "ta", "eht", "gninnigeb"})));
  }

  static String[] unusualLexOrder(String[] words) {
    return Arrays.stream(words)
        .sorted(Comparator.comparing(x -> new StringBuilder(x).reverse().toString()))
        .toArray(String[]::new);
  }
}
