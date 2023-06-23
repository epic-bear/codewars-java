package kata.kyu_7;

import java.util.Arrays;

public class PageReplacementAlgorithmsFIFO {

  public static void main(String[] args) {
    System.out.println(Arrays.toString(fifo(4, new int[]{1, 2, 3, 3, 4, 5, 1})));
  }

  public static int[] fifo(int n, int[] referenceList) {
    int[] memory = new int[n];
    Arrays.fill(memory, -1);

    int position = 0;

    for (int i = 0; i < referenceList.length; i++) {
      boolean isItInMemory = false;
      for (int data : memory) {
        if (data == referenceList[i]) {
          isItInMemory = true;
          break;
        }
      }
      if (!isItInMemory) {
        memory[position] = referenceList[i];
        position = position < n - 1 ? ++position : 0;
      }
    }
    return memory;
  }
}
