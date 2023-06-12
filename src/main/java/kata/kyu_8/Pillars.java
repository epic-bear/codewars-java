package kata.kyu_8;

public class Pillars {

  public static void main(String[] args) {

  }

  public static int pillars(int numPill, int dist, int width) {
    return numPill == 1 ? 0 : dist * 100 * (numPill - 1) + width * (numPill - 2);
  }
}
