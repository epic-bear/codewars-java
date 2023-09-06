package kata.kyu_8;

import java.util.Arrays;

public class FindMultiplesOfANumber {

  public static void main(String[] args) {
    System.out.println(Arrays.toString(find(5, 25)));
  }

  public static int[] find(int base, int limit) {
    int[] result = new int[limit / base];
    int current = base;
    for (int i = 0; i < result.length; i++) {
      result[i] = current;
      current += base;
    }
    return result;
  }
}
