package kata.kyu_7;

public class Factorial {

  public static void main(String[] args) {
    System.out.println(factorial(7));
  }

  public static long factorial(int n) {
    return n <= 1 ? 1 : n * factorial(n - 1);
  }
}
