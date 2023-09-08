package kata.kyu_7;

import java.util.regex.Pattern;

public class WalkingInTheHallway {

  public static void main(String[] args) {
    System.out.println(contact("---><----"));
  }

  public static int contact(String hallway) {
    return Pattern.compile(">-*<")
        .matcher(hallway)
        .results()
        .mapToInt(r -> r.group().length() / 2)
        .min()
        .orElse(-1);
  }
}
