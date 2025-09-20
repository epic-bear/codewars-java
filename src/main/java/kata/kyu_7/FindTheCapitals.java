package kata.kyu_7;

import java.util.Arrays;
import java.util.stream.IntStream;

public class FindTheCapitals {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(capitals("aAbB")));
    }

    public static int[] capitals(String s){
        return IntStream.range(0, s.length()).filter(x -> Character.isUpperCase(s.charAt(x))).toArray();
    }
}
