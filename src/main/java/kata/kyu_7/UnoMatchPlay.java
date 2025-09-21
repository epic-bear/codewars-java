package kata.kyu_7;

public class UnoMatchPlay {

  public static void main(String[] args) {
    System.out.println(canPlay(new String[]{"yellow 3", "yellow 5", "red 8"}, "red 2"));
  }

  public static boolean canPlay(String[] hand, String faceUp) {
    String[] currentFaceUp = faceUp.split(" ");
    for (String card : hand) {
      if (card.contains(currentFaceUp[0]) || card.contains(currentFaceUp[1])) {
        return true;
      }
    }
    return false;
  }
}
