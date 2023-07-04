package kata.kyu_7;

public class OddEvenStringSort {

  public static void main(String[] args) {
    System.out.println(sortMyString("SUBDERMATOGLYPHIC"));
  }

  public static String sortMyString(String s) {
    String even = "";
    String odd = "";

    for (int i = 0; i < s.length(); i++) {
      if (i % 2 == 0) {
        even += s.charAt(i);
      } else {
        odd += s.charAt(i);
      }
    }
    return even + " " + odd;
  }
}
