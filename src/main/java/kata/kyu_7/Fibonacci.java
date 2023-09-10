package kata.kyu_7;

public class Fibonacci {

  public static void main(String[] args) {
    System.out.println(fib(5));
  }

  public static long fib(int n) {
    return n <= 2 ? 1 : fib(n - 1) + fib(n - 2);
  }
}
