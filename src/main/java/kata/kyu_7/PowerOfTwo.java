package kata.kyu_7;

public class PowerOfTwo {

  public static void main(String[] args) {
    System.out.println(isPowerOfTwo(333));
  }

  public static boolean isPowerOfTwo(long n) {
    while (n % 2 == 0 && n > 1) {
      n /= 2;
    }
    return n == 1;
  }
}
