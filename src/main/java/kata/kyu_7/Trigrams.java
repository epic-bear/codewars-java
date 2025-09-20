package kata.kyu_7;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Trigrams {

    public static void main(String[] args) {
        System.out.println(trigrams("the quick red"));
    }

    public static String trigrams( String phrase ) {
        return IntStream.range(0, phrase.length() - 2)
                        .mapToObj(i -> phrase.substring(i, i + 3).replaceAll(" ", "_"))
                        .collect(Collectors.joining(" "));
    }
}
