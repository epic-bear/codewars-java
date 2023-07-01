package kata.kyu_7;

import java.util.Arrays;

public class FindTheStrayNumber {

  public static void main(String[] args) {
    System.out.println(stray(new int[]{1, 1, 2}));
  }

  static int stray(int[] numbers) {
    Arrays.sort(numbers);
    return numbers[0] == numbers[1] ? numbers[numbers.length - 1] : numbers[0];
  }
}
