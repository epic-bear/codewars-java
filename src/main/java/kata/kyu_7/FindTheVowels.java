package kata.kyu_7;

import java.util.Arrays;
import java.util.stream.IntStream;

public class FindTheVowels {

  private static final String vowels = "aeiouy";

  public static void main(String[] args) {
    System.out.println(Arrays.toString(vowelIndices("apple")));
  }

  public static int[] vowelIndices(String word){

    return IntStream.range(0, word.length())
        .filter(x -> vowels.contains(word.substring(x, x + 1).toLowerCase()))
        .map(i -> ++i).toArray();
  }
}
