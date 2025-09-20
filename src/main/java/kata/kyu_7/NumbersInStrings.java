package kata.kyu_7;

import java.util.Arrays;

public class NumbersInStrings {

    public static void main(String[] args) {
        System.out.println(solve("2ti9iei7qhr5"));
    }

    public static int solve(String s) {
        return Arrays.stream(s.split("[a-z]"))
                .filter(x -> !x.isEmpty())
                .mapToInt(Integer::parseInt).max().orElse(0);
    }
}
