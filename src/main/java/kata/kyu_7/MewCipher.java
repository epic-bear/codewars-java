package kata.kyu_7;

public class MewCipher {

  public static void main(String[] args) {
    System.out.println(decipher(
        new String[]{"u lk zxuq hfk as fouh",
                     "y l  zpuv  xe at sicd",
                     "welvayfuqbfpeaauaqcrc"}));
  }

  public static String decipher(String[] code) {
    String result = "";
    for (int i = 0; i < code[0].length(); i++) {
      int sum = 0;
      for (int j = 0; j < code.length; j++) {
        sum += Character.isSpaceChar(code[j].charAt(i)) ? 0 : code[j].charAt(i) - 96;
      }
      result += (char) (sum / code.length + (sum / code.length > 0 ? 96 : 32));
    }
    return result;
  }
}
