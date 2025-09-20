package kata.kyu_8;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Neutralisation {
    public static void main(String[] args) {
        System.out.println(neutralise("+", "+"));
    }

    public static String neutralise(String s1, String s2) {
        return IntStream.range(0, s1.length())
                .mapToObj(i -> s1.charAt(i) == s2.charAt(i)
                        ? s1.charAt(i) + ""
                        : "0")
                .collect(Collectors.joining());
    }
}
