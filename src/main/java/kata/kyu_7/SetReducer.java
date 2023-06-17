package kata.kyu_7;

import java.util.ArrayList;
import java.util.List;

public class SetReducer {

  public static void main(String[] args) {
    System.out.println(setReducer(new int[]{0, 4, 6, 8, 8, 8, 5, 5, 7}));
  }

  public static int setReducer(int[] input) {
    List<Integer> result = new ArrayList<>();
    int count = 0;
    int currentValue = input[0];
    for (int i : input) {
      if (i == currentValue) {
        count++;
      } else {
        result.add(count);
        count = 1;
        currentValue = i;
      }
    }
    result.add(count);
    return result.size() == 1 ? result.get(0)
        : setReducer(result.stream().mapToInt(Integer::intValue).toArray());
  }
}
