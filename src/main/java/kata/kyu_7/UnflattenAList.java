package kata.kyu_7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UnflattenAList {

  public static void main(String[] args) {
    System.out
        .println(Arrays.toString(unflatten(new int[]{1, 4, 5, 2, 1, 2, 4, 5, 2, 6, 2, 3, 3})));
  }

  public static Object[] unflatten(int[] flatArray) {
    List<Object> result = new ArrayList<>();
    for (int i = 0; i < flatArray.length; ) {
      if (flatArray[i] < 3) {
        result.add(flatArray[i]);
        ++i;
      } else if (flatArray[i] > 2) {
        int[] subArray = i + flatArray[i] < flatArray.length ? new int[flatArray[i]]
            : new int[flatArray.length - i];
        for (int j = 0; j < subArray.length; j++) {
          subArray[j] = flatArray[i];
          ++i;
        }
        result.add(subArray);
      }
      System.out.println(i);
    }
    return result.toArray();
  }
}
