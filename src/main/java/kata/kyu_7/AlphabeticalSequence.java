package kata.kyu_7;

import java.util.Arrays;
import java.util.stream.Collectors;

public class AlphabeticalSequence {

    public static void main(String[] args) {
        System.out.println(alphaSeq("ZpglnRxqenU"));
    }

    public static String alphaSeq(String s) {
        String abc = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String [] strings = s.toUpperCase().split("");
        return Arrays.stream(strings)
                .sorted()
                .map(x -> x +  x.toLowerCase().repeat(abc.indexOf(x)))
                .collect(Collectors.joining(","));
    }
}
