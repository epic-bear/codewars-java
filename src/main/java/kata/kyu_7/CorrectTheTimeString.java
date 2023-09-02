package kata.kyu_7;

import java.util.Arrays;

public class CorrectTheTimeString {

  public static void main(String[] args) {
    System.out.println(timeCorrect("23:59:60"));
  }

  public static String timeCorrect(String timestring) {
    if (timestring == null || !timestring.matches("\\d{2}:\\d{2}:\\d{2}")) {
      return null;
    }
    String[] subStrings = timestring.split(":");
    String[] result = new String[3];
    result[2] = String.valueOf(Integer.parseInt(subStrings[2]) % 60);
    result[1] = String
        .valueOf((Integer.parseInt(subStrings[1]) + Integer.parseInt(subStrings[2]) / 60) % 60);
    result[0] = String
        .valueOf((Integer.parseInt(subStrings[0]) + (Integer.parseInt(subStrings[1]) + Integer.parseInt(subStrings[2]) / 60) / 60) % 24);
    result = Arrays.stream(result).map(x -> x = x.length() < 2 ? 0 + x : x).toArray(String[]::new);
    return String.join(":", result);
  }
}
