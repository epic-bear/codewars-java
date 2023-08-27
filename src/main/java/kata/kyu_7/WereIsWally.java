package kata.kyu_7;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WereIsWally {

  public static void main(String[] args) {
    System.out.println(wheresWally("Wally"));
  }

  public static int wheresWally(String str) {
    Matcher m = Pattern.compile(" Wally\\b").matcher(" " + str);
    return m.find() ? m.start() : -1;
  }
}
