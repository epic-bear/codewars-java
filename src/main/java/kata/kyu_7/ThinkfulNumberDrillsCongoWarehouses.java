package kata.kyu_7;

public class ThinkfulNumberDrillsCongoWarehouses {

  public static void main(String[] args) {
    System.out.println(boxCapacity(70, 60, 15));
  }

  public static int boxCapacity(int l, int w, int h) {
    return (l * 3 / 4) * (w * 3 / 4) * (h * 3 / 4);
  }
}
