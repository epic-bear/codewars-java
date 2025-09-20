package kata.kyu_7;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

public class OrderingTheWords {

    public static void main(String[] args) {
        System.out.println(orderWord(" "));
    }

    public static String orderWord(String s) {
        if (s == null || s.isEmpty()) {
            return "Invalid String!";
        }
        return Arrays.stream(s.split("")).sorted(Comparator.naturalOrder()).collect(Collectors.joining(""));
    }
}
