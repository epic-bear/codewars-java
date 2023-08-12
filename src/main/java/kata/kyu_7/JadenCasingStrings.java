package kata.kyu_7;

import java.util.Arrays;
import java.util.stream.Collectors;

public class JadenCasingStrings {

  public static void main(String[] args) {
    System.out.println(toJadenCase(null));
  }

  public static String toJadenCase(String phrase) {
    return phrase == null || phrase.isBlank() ? null : Arrays.stream(phrase.split(" "))
        .map(word -> word.substring(0, 1).toUpperCase() + word.substring(1))
        .collect(Collectors.joining(" "));
  }
}
