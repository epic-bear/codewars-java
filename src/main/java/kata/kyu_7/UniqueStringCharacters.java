package kata.kyu_7;

import java.util.Arrays;
import java.util.stream.Collectors;

public class UniqueStringCharacters {

    public static void main(String[] args) {
        System.out.println(solve("xyab","xzca"));
    }

    public static String solve(String a, String b){
        return Arrays.stream((a + b).split(""))
                .filter(x -> a.contains(x) ^ b.contains(x))
                .collect(Collectors.joining(""));
    }
}
