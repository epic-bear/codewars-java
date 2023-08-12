package kata.kyu_7;

import java.util.Arrays;

public class BingoOrNot {

  public static void main(String[] args) {
    System.out.println(bingo(new int[]{21,13,2,7,5,14,7,15,9,10}));
  }

  public static String bingo(int[] numberArray){
    return Arrays.stream(numberArray)
        .distinct()
        .filter(x -> x == 2 || x == 7 || x == 9 || x == 14 || x == 15)
        .count() == 5 ? "WIN" : "LOSE";
  }
}
