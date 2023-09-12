package kata.kyu_7;

public class SortedYesNoHow {

  public static void main(String[] args) {
    System.out.println(isSortedAndHow(new int[]{1, 2}));
  }

  public static String isSortedAndHow(int[] array) {
    boolean desc = false;
    boolean asc = false;
    for (int i = 1; i < array.length; i++) {
      if (array[i] > array[i - 1]) {
        asc = true;
      }
      if (array[i] < array[i - 1]) {
        desc = true;
      }
    }
    if (asc && !desc) {
      return "yes, ascending";
    }
    if (desc && !asc) {
      return "yes, descending";
    }
    return "no";
  }
}
