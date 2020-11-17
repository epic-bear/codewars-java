package kata.kyu_7;

public class MaximumProduct {


  public int adjacentElementsProduct(int[] array) {

    int result = Integer.MIN_VALUE;

    for (int i = 0; i < array.length - 1; i++) {

      if (array[i] * array[i + 1] > result) {
        result = array[i] * array[i + 1];
      }
    }
    return result;
  }
}
