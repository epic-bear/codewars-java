package kata.kyu_7;

public class VAPORCODE {

  public static void main(String[] args) {
    System.out.println(vaporcode("Lets go to the movies"));
  }

  public static String vaporcode(String s) {
    String[] letters = s.replaceAll(" ", "").toUpperCase().split("");
    return String.join("  ", letters);
  }
}
