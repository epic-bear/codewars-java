package kata.kyu_7;

import java.util.Arrays;
import java.util.stream.Collectors;

public class MostValuableCharacter {

    public static void main(String[] args) {
        System.out.println(solve("bcdc"));
    }

    public static char solve(String s) {
        String result = "";
        int maxDiff = 0;
        for (int i = 0; i < s.length(); i++) {
            int diff = Math.abs(s.indexOf(s.charAt(i)) - s.lastIndexOf(s.charAt(i)));
            if (diff > maxDiff) {
                maxDiff = diff;
                result = String.valueOf(s.charAt(i));
            } else if (diff == maxDiff) {
                result += String.valueOf(s.charAt(i));
            }
        }
        return Arrays.stream(result.split("")).sorted().collect(Collectors.joining("")).charAt(0);
    }
}
