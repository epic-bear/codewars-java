package kata.kyu_7;

public class DotCalculator {

  public static void main(String[] args) {
    System.out.println(calc("..... * .."));
  }

  public static String calc(String txt) {
    String[] arr = txt.split(" ");
    switch (arr[1]) {
      case "*":
        return ".".repeat(arr[0].length() * arr[2].length());
      case "+":
        return ".".repeat(arr[0].length() + arr[2].length());
      case "-":
        return ".".repeat(arr[0].length() - arr[2].length());
      default:
        return ".".repeat(arr[0].length() / arr[2].length());
    }
  }
}
