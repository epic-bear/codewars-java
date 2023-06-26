package kata.kyu_7;

import java.util.ArrayList;
import java.util.List;
import org.apache.commons.lang3.tuple.Pair;

public class OrderedCountOfCharacters {

  public static void main(String[] args) {

  }

  public static List<Pair<Character, Integer>> orderedCount(String text) {
    List<Pair<Character, Integer>> result = new ArrayList<>();

    int length = text.length();
    while (text.length() > 0) {
      Character key = text.charAt(0);
      text = text.replaceAll(String.valueOf(key), "");
      result.add(Pair.of(key, length - text.length()));
      length = text.length();
    }

    return result;
  }
}
