package kata.kyu_7;

public class CollatzConjectureLength {

  public static void main(String[] args) {
    System.out.println(conjecture(20));
  }

  public static long conjecture(long x) {
    int count = 1;
    while (x > 1) {
      x = x % 2 == 0 ? x / 2 : x * 3 + 1;
      count++;
    }
    return count;
  }
}
