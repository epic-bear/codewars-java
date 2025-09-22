package kata.kyu_7;

public class EANValidation {

  public static void main(String[] args) {
    System.out.println(validate("9783815820865"));
  }

  public static boolean validate(final String eanCode) {
      int checkSum = 0;
      for (int i = 0; i <= eanCode.length() - 2; i++) {
        checkSum += Character.getNumericValue(eanCode.charAt(i)) * (i % 2 == 0 ? 1 : 3);
      }
      checkSum = checkSum % 10 == 0 ? 0 : 10 - (checkSum % 10);
      return checkSum == Integer.parseInt(eanCode.substring(eanCode.length() - 1));
  }
}
