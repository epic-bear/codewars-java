package kata.kyu_7;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ConsecutiveLetters {

    public static void main(String[] args) {
        System.out.println(solve("abc"));
    }

    public static boolean solve(String s) {
        return "abcdefghijklmnopqrstuvwxyz".contains(Stream.of(s.split("")).sorted().collect(Collectors.joining()));
    }
}
