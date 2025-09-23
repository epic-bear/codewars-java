package kata.kyu_7;


public class CharCodeCalculation {

  public static void main(String[] args) {
    System.out.println(calc("abcdef"));
  }

  public static int calc(String x) {
    int total1 = 0;
    int total2 = 0;

    for (char character : x.toCharArray()) {
      String nums = String.valueOf((int) character);
      for (int i = 0; i < nums.length(); i++) {
        int n = Character.getNumericValue(nums.charAt(i));
        total1 += n;
        total2 += n == 7 ? 1 : n;
      }
    }

    return total1 - total2;
  }
}
