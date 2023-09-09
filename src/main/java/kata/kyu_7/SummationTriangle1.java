package kata.kyu_7;

public class SummationTriangle1 {

  public static void main(String[] args) {
    System.out.println(getSum(3));
  }

  public static long getSum(int n) {
    long currentSum, prevSum, res = 0, incr = n + 1, i = 0;

    for (int j = n + 1; j > 0; j--) {
      currentSum = (incr * (incr + 1)) / 2;
      prevSum = (i * (i + 1)) / 2;
      res += currentSum - prevSum;

      i += 3;
      incr += 2;
    }

    return res;
  }
}
