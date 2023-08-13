package kata.kyu_7;

public class VisibleDotsOnADie {

  public static void main(String[] args) {
    System.out.println(totalAmountVisible(3, 6));
  }

  public static int totalAmountVisible(int topNum, int numOfSides){
    return numOfSides * (numOfSides + 1) / 2 - (numOfSides - topNum + 1);
  }
}
