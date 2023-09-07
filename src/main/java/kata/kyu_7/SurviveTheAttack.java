package kata.kyu_7;

import java.util.Arrays;

public class SurviveTheAttack {

  public static void main(String[] args) {
    System.out.println(block(new int[]{1, 3, 5, 7}, new int[]{2, 4, 6, 8}));
  }

  public static boolean block(int[] attackers, int[] defenders) {
    int count = 0;
    for (int i = 0; i < attackers.length && i < defenders.length; i++) {
      count += Integer.compare(defenders[i], attackers[i]);
    }
    count += defenders.length - attackers.length;
    return count == 0 ? Arrays.stream(defenders).sum() >= Arrays.stream(attackers).sum()
        : count > 0;
  }
}
