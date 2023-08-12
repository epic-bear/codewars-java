package kata.kyu_7;

import java.util.Arrays;

public class FizzBuzz {

  public static void main(String[] args) {
    System.out.println(Arrays.toString(solution(20)));
  }

  public static int[] solution(int number) {
    int[] result = new int[3];
    for (int i = 1; i < number; i++) {
      if (i % 3 == 0 && i % 5 == 0) {
        result[2]++;
      } else if (i % 3 == 0) {
        result[0]++;
      } else if (i % 5 == 0) {
        result[1]++;
      }
    }
    return result;
  }
}
