package kata.kyu_7;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Move10 {

    public static void main(String[] args) {
        System.out.println(moveTen("testcase"));
    }

    public static String moveTen(String s) {
        String abc = "abcdefghijklmnopqrstuvwxyz";
        return Arrays.stream(s.split(""))
                .map(x -> String.valueOf(abc.charAt((abc.indexOf(x) + 10) % 26)))
                .collect(Collectors.joining(""));
    }
}
