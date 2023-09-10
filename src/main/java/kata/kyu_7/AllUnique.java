package kata.kyu_7;

import java.util.Arrays;
import java.util.stream.Collectors;

public class AllUnique {

  public static void main(String[] args) {
    System.out.println(hasUniqueChars("++-"));
  }

  public static boolean hasUniqueChars(String str) {
    return str.length() == Arrays.stream(str.split("")).distinct()
        .collect(Collectors.joining(""))
        .length();
  }
}
