package kata.kyu_7;

import java.util.Arrays;

public class RunningOutOfSpace {

  public static void main(String[] args) {
    System.out.println(Arrays.toString(spacey(new String[]{"kevin", "has", "no", "space"})));
  }

  public static String[] spacey(String[] array) {
    for (int i = 1; i < array.length; i++) {
      array[i] = array[i - 1] + array[i];
    }
    return array;
  }
}
