package kata.kyu_7;

import static java.util.Arrays.stream;
import static java.util.stream.Collectors.joining;

public class SomethingCapitalized {

  public static void main(String[] args) {
    System.out.println(testSomethingCapitalized("aa"));
  }

  public static String testSomethingCapitalized(String s) {
    return s.isEmpty() ? s : stream(s.split(" "))
        .map(i -> i.substring(0, i.length() - 1) + i.toUpperCase().charAt(i.length() - 1))
        .collect(joining(" "));
  }
}
