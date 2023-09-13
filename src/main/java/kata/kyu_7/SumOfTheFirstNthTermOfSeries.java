package kata.kyu_7;

public class SumOfTheFirstNthTermOfSeries {

  public static void main(String[] args) {
    System.out.println(seriesSum(5));
  }

  public static String seriesSum(int n) {
    double result = 0.0;

    for (int i = 0; i < n; i++) {
      result += 1.0 / (1 + 3 * i);
    }

    return String.format("%.2f", result);
  }
}