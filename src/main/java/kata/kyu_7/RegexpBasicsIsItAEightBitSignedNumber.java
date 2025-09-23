package kata.kyu_7;

public class RegexpBasicsIsItAEightBitSignedNumber {

  public static void main(String[] args) {
    System.out.println(isSignedEightBitNumber("00"));
  }

  public static boolean isSignedEightBitNumber(String s) {
    return s.matches("^(?:-?(?:[1-9][0-9]?|1[01][0-9]|12[0-7])|0|-128)$");
  }

}
