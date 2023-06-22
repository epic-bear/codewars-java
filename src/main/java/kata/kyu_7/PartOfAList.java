package kata.kyu_7;

import java.util.Arrays;

public class PartOfAList {

  public static void main(String[] args) {
    System.out.println(Arrays.deepToString(partlist(new String[]{"cdIw", "tzIy", "xDu", "rThG"})));
  }

  public static String[] partlist(String[] arr) {
    String[] result = new String[arr.length - 1];
    for (int i = 0; i < arr.length - 1; i++) {
      String[] variant = arr.clone();
      variant[i] = variant[i] + ",";
      result[i] = Arrays.toString(variant).replaceAll(", ", " ");
    }
    return result;
  }
}
