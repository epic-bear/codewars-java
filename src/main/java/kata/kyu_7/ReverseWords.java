package kata.kyu_7;

public class ReverseWords {

  public static void main(String[] args) {
    System.out.println(reverseWords("This is an example!"));
  }

  public static String reverseWords(final String original) {
    String[] strings = original.split(" ");

    for (int i = 0; i < strings.length; i++) {
      strings[i] = new StringBuilder(strings[i]).reverse().toString();
    }
    return String.join(" ", strings).isEmpty() ? original : String.join(" ", strings);
  }
}
