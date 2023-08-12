package kata.kyu_7;

import java.util.stream.Collectors;

public class DigitsExplosion {

  public static void main(String[] args) {
    System.out.println(explode("0"));
  }

  public static String explode(String digits) {
    return digits.chars()
        .mapToObj(Character::toString)
        .map(e -> e.repeat(Integer.parseInt(e)))
        .collect(Collectors.joining());
  }
}
