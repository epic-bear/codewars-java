package kata.kyu_7;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SubstringFun {

  public static void main(String[] args) {
    System.out.println(nthChar(new String[] {"yoda", "best", "has"}));
  }

  public static String nthChar(String[] words) {
    return IntStream.range(0, words.length).mapToObj(x -> String.valueOf(words[x].charAt(x)))
        .collect(Collectors.joining());
  }
}
