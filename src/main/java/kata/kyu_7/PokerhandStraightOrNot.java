package kata.kyu_7;

import java.util.List;
import java.util.stream.Collectors;

public class PokerhandStraightOrNot {

  public static void main(String[] args) {
    System.out.println(IsStraight(List.of(14, 2, 4, 5, 6)));
  }

  public static boolean IsStraight(List<Integer> cards) {
    int count = cards.contains(14) && cards.contains(2) ? 1 : 0;
    cards = cards.stream().sorted().distinct().collect(Collectors.toList());

    for (int i = 0; i < cards.size() - 1; i++) {
      if (cards.get(i + 1) - cards.get(i) == 1) {
        count++;
        if (count == 4) {
          break;
        }
      } else {
        count = 0;
      }
    }
    return count == 4;
  }
}
