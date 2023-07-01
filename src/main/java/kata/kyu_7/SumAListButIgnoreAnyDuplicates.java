package kata.kyu_7;


public class SumAListButIgnoreAnyDuplicates {

  public static void main(String[] args) {
    System.out.println(sumNoDuplicates(new int[]{1, 1, 2, 3}));
  }

  public static int sumNoDuplicates(int[] arr) {
    int sum = 0;
    for (int k : arr) {
      int count = 0;
      for (int i : arr) {
        if (k == i) {
          count++;
        }
      }
      if (count == 1) {
        sum += k;
      }
    }
    return sum;
  }
}
