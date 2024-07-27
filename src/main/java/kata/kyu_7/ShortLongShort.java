package kata.kyu_7;

import java.util.Arrays;
import java.util.Comparator;

public class ShortLongShort {

    public static void main(String[] args) {
        System.out.println(solution("a", "bb"));
    }

    public static String solution(String a, String b) {
        String[] strings = new String[] {a, b};
        Arrays.sort(strings, Comparator.comparing(String::length));
        return strings[0] + strings[1] + strings[0];
    }
}
