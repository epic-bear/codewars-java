package kata.kyu_7;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class MakeBackronym {

  private static Map<String, String> dictionary = new HashMap<>();

  public static void main(String[] args) {
    System.out.println(makeBackronym("dgm"));
  }

  public static String makeBackronym(String acronym) {
    return acronym.toUpperCase().chars().mapToObj(s -> dictionary.get(String.valueOf((char) s)))
        .collect(
            Collectors.joining(" "));
  }
}
