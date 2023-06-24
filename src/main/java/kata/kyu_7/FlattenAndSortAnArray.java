package kata.kyu_7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class FlattenAndSortAnArray {

  public static void main(String[] args) {
    System.out.println(
        Arrays.toString(flattenAndSort(new int[][]{{3, 2, 1}, {7, 9, 8}, {6, 4, 5}})));
  }

  public static int[] flattenAndSort(int[][] array) {
    List<Integer> numbers = new ArrayList<>();
    for (int i = 0; i < array.length; i++) {
      for (int j = 0; j < array[i].length; j++) {
        numbers.add(array[i][j]);
      }
    }
    numbers.sort(Comparator.naturalOrder());
    return numbers.stream().mapToInt(Integer::intValue).toArray();
  }
}
