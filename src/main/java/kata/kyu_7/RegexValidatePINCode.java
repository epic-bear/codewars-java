package kata.kyu_7;

public class RegexValidatePINCode {

  public static void main(String[] args) {
    System.out.println(validatePin(""));
  }

  public static boolean validatePin(String pin) {
    return pin.matches("\\d{4}|\\d{6}");
  }
}
