package kata.kyu_7;


public class SumOfCubes {

  public static void main(String[] args) {
    System.out.println(sumCubes(2));
  }

  public static long sumCubes(long n) {
    long result = 0;

    for (int i = 0; i <= n; i++) {
      result += (long) Math.pow(i, 3);
    }

    return result;
  }
}
