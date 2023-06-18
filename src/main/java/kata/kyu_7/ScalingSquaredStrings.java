package kata.kyu_7;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ScalingSquaredStrings {

  public static void main(String[] args) {
    System.out.println(scale("abcd\nefgh\nijkl\nmnop", 2, 3));
  }

  public static String scale(String string, int k, int v) {
    return String.join("", Arrays.stream(string.split("\n"))
        .map(x -> x.chars().mapToObj(c -> String.valueOf((char) c).repeat(k))
            .collect(Collectors.joining()).concat("\n").repeat(v)).collect(Collectors.joining()))
        .trim();
  }
}
