package kata.kyu_7;

import java.util.Arrays;

public class SimpleStringCharacters {

  public static void main(String[] args) {
    System.out.println(Arrays.toString(Solve("Codewars@codewars123.com")));
  }

  public static int[] Solve(String word) {
    return new int[]{
        word.replaceAll("[^A-Z]", "").length(),
        word.replaceAll("[^a-z]", "").length(),
        word.replaceAll("\\D", "").length(),
        word.replaceAll("\\w", "").length()
    };
  }
}
