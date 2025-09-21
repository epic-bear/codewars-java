package kata.kyu_7;

public class StonesOnTheTable {

  public static void main(String[] args) {
    System.out.println(solve("RRGGBB"));
  }

  public static int solve(String stones) {
    return stones.length() - stones.replaceAll("([RGB])\\1+", "$1").length();
  }
}
