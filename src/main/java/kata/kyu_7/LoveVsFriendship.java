package kata.kyu_7;

import java.util.Arrays;

public class LoveVsFriendship {

  public static void main(String[] args) {
    System.out.println(wordsToMarks("attitude"));
  }

  public static int wordsToMarks (String text) {
    return Arrays.stream(text.split(""))
        .mapToInt(letter -> Character.getNumericValue(letter.charAt(0)) - 9).sum();
  }
}
