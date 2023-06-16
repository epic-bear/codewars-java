package kata.kyu_7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class PlayingCardsDrawOrderPart1 {

  public static void main(String[] args) {
    System.out.println(draw(Arrays.asList("KC", "KH", "QC", "KS", "KD", "QH", "QD", "QS")));
  }

  public static List<String> draw(List<String> deck) {
    LinkedList<String> deckCopy = new LinkedList<>(deck);
    List<String> result = new ArrayList<>();
    boolean draw = true;
    while (!deckCopy.isEmpty()) {
      if (draw) {
        result.add(deckCopy.pollFirst());
        draw = false;
      } else {
        deckCopy.addLast(deckCopy.pollFirst());
        draw = true;
      }
    }
    return result;
  }
}
