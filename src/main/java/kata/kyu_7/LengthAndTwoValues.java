package kata.kyu_7;

import java.util.Arrays;

public class LengthAndTwoValues {

  public static void main(String[] args) {
    System.out.println(Arrays.toString(alternate(5, "true", "false")));
  }

  public static String[] alternate(int n, String firstValue, String secondValue) {
    String[] result = new String[n];

    for (int i = 0; i < n; i++) {
      result[i] = i % 2 == 0 ? firstValue : secondValue;
    }
    return result;
  }
}
