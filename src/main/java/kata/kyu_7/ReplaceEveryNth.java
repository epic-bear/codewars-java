package kata.kyu_7;

public class ReplaceEveryNth {

  public static void main(String[] args) {
    System.out.println(replaceNth("Vader said: No, I am your father!", 2, 'a', 'o'));
  }

  public static String replaceNth(String text, int n, char oldValue, char newValue) {
    char[] chars = text.toCharArray();
    int count = 0;
    for (int i = 0; i < chars.length; i++) {
      if (chars[i] == oldValue) {
        if (count == n - 1) {
          chars[i] = newValue;
          count = 0;
        } else {
          count++;
        }
      }
    }
    return String.valueOf(chars);
  }
}
