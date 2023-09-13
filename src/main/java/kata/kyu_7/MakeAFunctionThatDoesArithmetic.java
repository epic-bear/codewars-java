package kata.kyu_7;

public class MakeAFunctionThatDoesArithmetic {

  public static void main(String[] args) {
    System.out.println(arithmetic(8, 2, "subtract"));
  }

  public static int arithmetic(int a, int b, String operator) {
    switch (operator) {
      case "add":
        return a + b;
      case "subtract":
        return a - b;
      case "multiply":
        return a * b;
      default:
        return a / b;
    }
  }
}
