package kata.kyu_7;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FindMinAndMax {

  public static void main(String[] args) {
    System.out.println(Arrays.toString(getMinMax(Arrays.asList(1, 2))));
  }

  static int[] getMinMax(List<Integer> list) {
    Collections.sort(list);
    return new int[]{list.get(0), list.get(list.size() - 1)};
  }
}
