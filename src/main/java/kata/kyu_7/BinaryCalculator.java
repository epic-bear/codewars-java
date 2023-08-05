package kata.kyu_7;

public class BinaryCalculator {

  public static void main(String[] args) {
    System.out.println(calculate("1", "10", "subtract"));
  }

  public static String calculate(final String n1, final String n2, final String o) {
    int num1 = Integer.parseInt(n1, 2);
    int num2 = Integer.parseInt(n2, 2);
    switch (o) {
      case "add":
        return Integer.toBinaryString(num1 + num2);
      case "subtract":
        return Integer.toBinaryString(num1 - num2);
      default:
        return Integer.toBinaryString(num1 * num2);
    }
  }
}
