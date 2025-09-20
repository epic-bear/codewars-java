package kata.kyu_7;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SearchForLetters {

    public static void main(String[] args) {
        System.out.println(search("aaaaaaa79345675"));
    }

    public static String search(String line) {
        String lowLine = line.toLowerCase();
        return IntStream.range(0, 26)
                .map(x -> lowLine.contains(String.valueOf((char) ('a' + x))) ? 1 : 0)
                .mapToObj(String::valueOf).collect(Collectors.joining(""));
    }
}
