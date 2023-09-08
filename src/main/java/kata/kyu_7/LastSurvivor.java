package kata.kyu_7;

public class LastSurvivor {

  public static void main(String[] args) {
    System.out.println(lastSurvivor("abc", new int[]{1, 1}));
  }

  public static String lastSurvivor(String letters, int[] coords) {
    StringBuilder sb = new StringBuilder(letters);
    for (int coord : coords) {
      sb.deleteCharAt(coord);
    }
    return sb.toString();
  }
}
