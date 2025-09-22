package kata.kyu_7;

public class InterlockingBinaryPairs {

  public static void main(String[] args) {
    System.out.println(interlockable(9, 4));
  }

  public static boolean interlockable(long a, long b) {
    return (a & b) == 0;
  }
}
