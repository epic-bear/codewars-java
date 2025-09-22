package kata.kyu_7;

public class CountOfCodepointInAUTF16String {

  public static void main(String[] args) {
    System.out.println(getRealLength("😸🦌🚀"));
  }

  public static int getRealLength(String str) {
        return str.codePointCount(0, str.length());
  }
}
