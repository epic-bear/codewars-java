package kata.kyu_7;

public class GetTheMiddleCharacter {

  public static void main(String[] args) {
    System.out.println(getMiddle("middle"));
  }

  public static String getMiddle(String word) {
    int wordLength = word.length();
    return wordLength % 2 == 0 ? word.substring(wordLength / 2 - 1, wordLength / 2 + 1)
        : word.substring(wordLength / 2, wordLength / 2 + 1);
  }
}
