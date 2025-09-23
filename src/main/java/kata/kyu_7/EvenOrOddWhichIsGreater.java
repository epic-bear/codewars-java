package kata.kyu_7;

public class EvenOrOddWhichIsGreater {

  public static void main(String[] args) {
    System.out.println(evenOrOdd("123"));
  }

  public static String evenOrOdd(String str) {
    int oddSum = 0;
    int evenSum = 0;

    for (int i = 0; i < str.length(); i++) {
      int num = Character.getNumericValue(str.charAt(i));
      if (num % 2 == 0) {
        evenSum += num;
      } else {
        oddSum += num;
      }
    }
    return evenSum > oddSum ? "Even is greater than Odd"
        : evenSum < oddSum ? "Odd is greater than Even" : "Even and Odd are the same";
  }
}
