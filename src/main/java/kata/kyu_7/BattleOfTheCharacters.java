package kata.kyu_7;

public class BattleOfTheCharacters {

  public static void main(String[] args) {
    System.out.println(battle("AAA",  "Z"));
  }

  public static String battle(final String x, final String y) {
    int xSum = x.chars().sum() - 64 * x.length();
    int ySum = y.chars().sum() - 64 * y.length();
    return xSum > ySum ? x : (xSum < ySum ? y : "Tie!");
  }
}
