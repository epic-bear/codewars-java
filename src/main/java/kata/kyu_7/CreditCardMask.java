package kata.kyu_7;

public class CreditCardMask {

  public static void main(String[] args) {
    System.out.println(maskify("1"));
  }

  public static String maskify(String str) {
    if (str.length() <= 4) {
      return str;
    }
    return "#".repeat(str.length() - 4) + str.substring(str.length() - 4);
  }
}
