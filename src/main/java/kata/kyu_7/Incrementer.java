package kata.kyu_7;

import java.util.Arrays;

public class Incrementer {

  public static void main(String[] args) {
    System.out.println(Arrays.toString(incrementer(new int[]{1, 2, 3})));
  }

  public static int[] incrementer(int[] numbers) {
    for (int i = 0; i < numbers.length; i++) {
      numbers[i] = (numbers[i] + i + 1) % 10;
    }
    return numbers;
  }
}
