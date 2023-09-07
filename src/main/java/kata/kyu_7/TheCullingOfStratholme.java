package kata.kyu_7;

import java.util.Arrays;
import java.util.stream.Collectors;

public class TheCullingOfStratholme {

  public static void main(String[] args) {
    System.out.println(purify("1i2 33 i4i5 i555ii5"));
  }

  public static String purify(String s) {
    return Arrays.stream(s.split(" "))
        .map(x -> x.replaceAll("[iI]+", "i")
            .replaceAll("[^\\s]?[iI][^\\s]?", "")
            .trim())
        .filter(x -> !x.isEmpty())
        .collect(Collectors.joining(" "));
  }
}
