package kata.kyu_8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class IsThereAVowelInThere {
    public static void main(String[] args) {
        System.out.println(isVow(List.of(118,117,120,121,117,98,122,97,120,106,104,116,113,114,113,120,106)));
    }

    public static List<Object> isVow(List<Integer> input) {
        Map<Integer,String> map = Map.of(101, "e", 117, "u", 97, "a", 105, "i", 111, "o");
        return Arrays.stream(input.toArray()).map(x -> x = map.containsKey(x) ? map.get(x) : x).toList();
    }
}
