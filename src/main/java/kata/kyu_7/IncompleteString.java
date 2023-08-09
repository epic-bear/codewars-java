package kata.kyu_7;

public class IncompleteString {

  public static void main(String[] args) {
    System.out.println(testIncompleteString("a"));
  }

  public static String testIncompleteString(String s) {
    String result = "";
    char[] chars = s.toCharArray();
    for (int i = 0; i < chars.length; i += 2) {
      if (i + 1 < chars.length) {
        result += String.valueOf((char) ((chars[i] + chars[i + 1]) / 2));
      } else {
        result += chars[i];
      }
    }
    return result;
  }
}
