package kata.kyu_7;

public class GreenGlassDoor {

  public static void main(String[] args) {

  }

  boolean stepThroughWith(String s) {

    for (int i = 1; i < s.length(); i++) {
      if (s.charAt(i - 1) == s.charAt(i)) {
        return true;
      }
    }

    return false;
  }
}
