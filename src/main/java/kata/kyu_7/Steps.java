package kata.kyu_7;

public class Steps {

  public static void main(String[] args) {
    System.out.println(step(45, 52));
  }

  public static int step(int x, int y) {
    int dif = y - x;

    if (dif <= 3) {
      return dif;
    }

    return (int) (Math.sqrt(dif - 0.5) * 2);
  }
}
