package kata.kyu_7;

import java.util.stream.IntStream;

import static org.apache.commons.lang3.StringUtils.countMatches;

public class SimpleEviternityNumbers {

    public static void main(String[] args) {
        System.out.println(solve(0, 1000));
    }

    public static int solve(int a, int b) {
        return (int) IntStream.range(a, b)
                .filter(x -> String.valueOf(x).matches("[853]*"))
                .mapToObj(String::valueOf)
                .filter(x -> countMatches(x, "8") >= countMatches(x, "5") &&
                        countMatches(x, "5") >= countMatches(x, "3"))
                .count();
    }
}
