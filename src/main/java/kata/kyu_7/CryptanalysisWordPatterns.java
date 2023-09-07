package kata.kyu_7;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CryptanalysisWordPatterns {

  public static void main(String[] args) {
    System.out.println(wordPattern("Hippopotomonstrosesquippedaliophobia"));
  }

  public static String wordPattern(String word) {
    word = word.toLowerCase();
    List<Integer> result = new ArrayList<>();
    String letters = word.substring(0, 1);
    for (int i = 0; i < word.length(); i++) {
      if (!letters.contains(word.charAt(i) + "")) {
        letters += word.charAt(i);
      }
      result.add(letters.indexOf(word.charAt(i)));
    }
    return result.stream().map(String::valueOf).collect(Collectors.joining("."));
  }
}
