package kata.kyu_7;


public class RegexpBasicsIsItAHexadecimalNumber {

  public static void main(String[] args) {
    System.out.println(isHexNumber("0xDEADBEEF"));
  }

  public static boolean isHexNumber(String s) {
    return s.matches("^(0[xX])?[0-9a-fA-F]+$");
  }
}
