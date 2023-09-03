package kata.kyu_7;

public class DebugSumOfDigitsOfANumber {

  public static void main(String[] args) {
    System.out.println(sumOfDigits(123));
  }

  public static int sumOfDigits(int n) {
    return String.valueOf(n).chars().map(x -> x - 48).sum();
  }
}
