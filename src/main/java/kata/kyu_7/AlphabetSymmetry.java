package kata.kyu_7;

import java.util.Arrays;

public class AlphabetSymmetry {

  public static void main(String[] args) {
    System.out
        .println(Arrays.toString(solve(new String[]{"IAMDEFANDJKL", "thedefgh", "xyzDEFghijabc"})));
  }

  public static int[] solve(String[] arr) {
    int[] result = new int[arr.length];
    for (int i = 0; i < arr.length; i++) {
      int count = 0;
      arr[i] = arr[i].toUpperCase();
      for (int j = 0; j < arr[i].length(); j++) {
        if (j + 65 == arr[i].charAt(j)) {
          count++;
        }
        result[i] = count;
      }
    }
    return result;
  }
}
