package kata.kyu_7;

import java.util.Arrays;
import java.util.Comparator;

public class SuzukiNeedsHelpLiningUpHisStudents {

  public static void main(String[] args) {
    System.out.println(Arrays.toString(
        lineupStudents("Tadashi Takahiro Takao Takashi Takayuki Takehiko Takeo Takeshi Takeshi")));
  }

  public static String[] lineupStudents(String students) {
    return Arrays.stream(students.split(" "))
        .sorted(Comparator.comparing(String::length).reversed()
            .thenComparing(Comparator.reverseOrder()))
        .toArray(String[]::new);
  }
}
