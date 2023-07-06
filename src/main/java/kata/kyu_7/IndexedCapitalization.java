package kata.kyu_7;

public class IndexedCapitalization {

  public static void main(String[] args) {
    System.out.println(capitalize("abcdef", new int[]{1, 2, 5}));
  }

  public static String capitalize(String s, int[] ind) {
    char[] chars = s.toCharArray();

    for (int i : ind) {
      if (i < chars.length) {
        chars[i] = Character.toUpperCase(chars[i]);
      }
    }
    return String.valueOf(chars);
  }
}
