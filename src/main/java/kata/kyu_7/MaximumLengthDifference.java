package kata.kyu_7;

import java.util.Arrays;
import java.util.Comparator;

public class MaximumLengthDifference {

  public static void main(String[] args) {
    System.out.println(mxdiflg(
        new String[]{"hoqq", "bbllkw", "oox", "ejjuyyy", "plmiis", "xxxzgpsssa", "xxwwkktt",
            "znnnnfqknaz", "qqquuhii", "dvvvwz"},
        new String[]{"cccooommaaqqoxii", "gggqaffhhh", "tttoowwwmmww"}));
  }

  public static int mxdiflg(String[] a1, String[] a2) {
    if (a1.length == 0 || a2.length == 0) {
      return -1;
    }
    Arrays.sort(a1, Comparator.comparingInt(String::length));
    Arrays.sort(a2, Comparator.comparingInt(String::length));
    int a1Max = a1[0].length();
    int a1Min = a1[a1.length - 1].length();
    int a2Max = a2[0].length();
    int a2Min = a2[a2.length - 1].length();

    return Math.max(Math.abs(a1Max - a2Min), Math.abs(a2Max - a1Min));
  }
}
