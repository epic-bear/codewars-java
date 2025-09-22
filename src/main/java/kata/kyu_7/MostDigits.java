package kata.kyu_7;

public class MostDigits {

  public static void main(String[] args) {
    System.out.println(findLongest(new int[]{1263119984, -1582599342, 2000, 10, 4000, 100, -100}));
  }

  public static int findLongest(int[] numbers) {
    int maxLength = Integer.MIN_VALUE;
    int result = 0;
    for (int number : numbers) {
      int length = String.valueOf(Math.abs(number)).length();
      if (length > maxLength) {
        maxLength = length;
        result = number;
      }
    }
    return result;
  }
}
