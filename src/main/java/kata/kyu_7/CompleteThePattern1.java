package kata.kyu_7;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class CompleteThePattern1 {

    public static void main(String[] args) {
        System.out.println(pattern(2));
    }

    public static String pattern(int n) {
        return IntStream.rangeClosed(1, n).mapToObj(num -> String.valueOf(num).repeat(num))
                .collect(Collectors.joining("\n"));
    }
}
