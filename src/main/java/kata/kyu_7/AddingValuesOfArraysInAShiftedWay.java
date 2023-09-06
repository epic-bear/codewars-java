package kata.kyu_7;

import java.util.Arrays;

public class AddingValuesOfArraysInAShiftedWay {

  public static void main(String[] args) {
    System.out.println(Arrays.toString(
        addingShifted(new int[][]{new int[]{1, 2, 3, 4, 5, 6}, new int[]{7, 7, 7, 7, 7, 7}}, 3)));
  }

  public static int[] addingShifted(int[][] arrayOfArrays, int shift) {
    int[] result = new int[arrayOfArrays[0].length + shift * (arrayOfArrays.length - 1)];
    int currentShift = 0;
    for (int[] arrayOfArray : arrayOfArrays) {
      for (int j = 0; j < arrayOfArray.length; j++) {
        result[j + currentShift] += arrayOfArray[j];
      }
      currentShift += shift;
    }
    return result;
  }
}
