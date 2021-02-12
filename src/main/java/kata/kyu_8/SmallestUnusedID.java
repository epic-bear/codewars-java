package kata.kyu_8;

import java.util.Arrays;

public class SmallestUnusedID {

  public static void main(String[] args) {

  }

  public static int getSmallestID(int[] ids) {

    Arrays.sort(ids);

    int id = 0;

    for (int j : ids) {
      if (id == j) {
        id++;
      }
    }
    return id;
  }
}
