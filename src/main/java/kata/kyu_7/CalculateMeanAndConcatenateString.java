package kata.kyu_7;

import java.util.Arrays;
import java.util.stream.IntStream;

public class CalculateMeanAndConcatenateString {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(
                mean(new char[]{'u', '6', 'd', '1', 'i', 'w', '6', 's', 't', '4', 'a', '6', 'g', '1', '2', 'w', '8',
                        'o', '2', '0'})));
    }

    public static Object[] mean(char[] lst) {
        Object[] result = new Object[2];
        result[0] = IntStream.range(0, lst.length).mapToObj(x -> lst[x]).filter(Character::isDigit).map(x -> x - '0')
                .mapToInt(Integer::intValue).sum() / 10.;
        result[1] = new String(lst).replaceAll("\\d", "");
        return result;
    }
}
