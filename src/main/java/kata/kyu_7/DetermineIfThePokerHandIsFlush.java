package kata.kyu_7;

public class DetermineIfThePokerHandIsFlush {

  public static void main(String[] args) {
    System.out.println(CheckIfFlush(new String[]{"AS", "3S", "9S", "KS", "4S"}));
  }

  public static boolean CheckIfFlush(String[] cards) {
    String cardsString = String.join("", cards);

    return cardsString.length() - 5 == cardsString.replaceAll(
        String.valueOf(cards[0].charAt(cards[0].length() - 1)), "").length();
  }
}



