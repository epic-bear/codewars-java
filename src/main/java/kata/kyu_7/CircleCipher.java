package kata.kyu_7;

public class CircleCipher {

  public static void main(String[] args) {
    System.out.println(encode("codewars"));
    System.out.println(decode("csordaew"));
  }

  public static String encode(String s) {
    StringBuilder a = new StringBuilder(s.substring(0, (s.length() + 1) / 2));
    StringBuilder b = new StringBuilder(s.substring((s.length() + 1) / 2)).reverse();
    String[] encoded = new String[s.length()];
    int index = 0;
    for (int i = 0; i < s.length(); i++) {
      if (i % 2 == 0) {
        encoded[i] = String.valueOf(a.charAt(index));
      } else {
        encoded[i] = String.valueOf(b.charAt(index));
        index++;
      }
    }
    return String.join("", encoded);
  }

  public static String decode(String s) {
    StringBuilder a = new StringBuilder();
    StringBuilder b = new StringBuilder();
    for (int i = 0; i < s.length(); i++) {
      if (i % 2 == 0) {
        a.append(s.charAt(i));
      } else {
        b.append(s.charAt(i));
      }
    }
    return a.append(b.reverse()).toString();
  }
}
