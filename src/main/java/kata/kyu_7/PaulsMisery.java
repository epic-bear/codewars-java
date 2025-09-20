package kata.kyu_7;

import java.util.Arrays;
import java.util.Map;

public class PaulsMisery {

    public static void main(String[] args) {
        System.out.println(paul(new String[]{"life", "eating", "life"}));
    }

    public static String paul(String[] x) {
        Map<String, Integer> scores = Map.of("kata", 5, "Petes kata", 10, "life", 0, "eating", 1);
        int result = Arrays.stream(x).mapToInt(scores::get).sum();

        return result < 40 ? "Super happy!" : result < 70 ? "Happy!" : result < 100 ? "Sad!" : "Miserable!";
    }
}
