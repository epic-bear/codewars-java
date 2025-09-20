package kata.kyu_7;

import java.util.Arrays;

public class MatchMyHusband {

    public static void main(String[] args) {
        System.out.println(match(new int[]{15, 24, 12}, 4));
    }

    public static String match(int[] usefulness, int months) {
        return Arrays.stream(usefulness).sum() >= 100 * Math.pow(0.85, months) ? "Match!" : "No match!";
    }
}
