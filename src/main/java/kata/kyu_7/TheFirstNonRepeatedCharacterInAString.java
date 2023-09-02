package kata.kyu_7;

public class TheFirstNonRepeatedCharacterInAString {

  public static void main(String[] args) {
    System.out.println(firstNonRepeated("test"));
  }

  public static Character firstNonRepeated(String source) {
    for (char c : source.toCharArray()) {
      if (source.indexOf(c) == source.lastIndexOf(c)) {
        return c;
      }
    }
    return null;
  }
}
