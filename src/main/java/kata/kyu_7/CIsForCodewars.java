package kata.kyu_7;

public class CIsForCodewars {

  public static void main(String[] args) {
    System.out.println(generateC(2));
  }

  public static String generateC(int size) {
    StringBuilder result = new StringBuilder();
    for (int i = 0; i < size; i++) {
      result.append("CCCCC".repeat(size)).append("\n");
    }
    for (int i = 0; i < 3 * size; i++) {
      result.append("C".repeat(size)).append("\n");
    }
    for (int i = 0; i < size; i++) {
      result.append("CCCCC".repeat(size)).append("\n");
    }
    return result.toString().trim();
  }
}
