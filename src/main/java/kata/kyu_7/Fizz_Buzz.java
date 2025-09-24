package kata.kyu_7;

import java.util.Arrays;

public class Fizz_Buzz {

  public static void main(String[] args) {
    System.out.println(Arrays.toString(fizzBuzz(3)));
  }

  public static String[] fizzBuzz(int n) {
    String[] result = new String[n];

    for (int i = 1; i <= n; i++) {
      result[i - 1] = "";
      if (i > 2) {
        if (i % 3 == 0) {
          result[i - 1] += "Fizz";
        }
        if (i % 5 == 0) {
          result[i - 1] += "Buzz";
        }
      }
      if (result[i - 1].isEmpty()) {
        result[i - 1] = String.valueOf(i);
      }
    }
    return result;
  }
}
