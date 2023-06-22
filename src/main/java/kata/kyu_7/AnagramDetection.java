package kata.kyu_7;

import java.util.Arrays;

public class AnagramDetection {

  public static void main(String[] args) {
    System.out.println(isAnagram("foefet", "toffee"));
  }

  public static boolean isAnagram(String test, String original) {
    char[] testChars = test.toLowerCase().toCharArray();
    char[] originalChars = original.toLowerCase().toCharArray();

    Arrays.sort(testChars);
    Arrays.sort(originalChars);

    return Arrays.equals(testChars, originalChars);
  }
}
