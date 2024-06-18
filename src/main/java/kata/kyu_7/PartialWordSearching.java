package kata.kyu_7;

import java.util.Arrays;

public class PartialWordSearching {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(findWord("ade",
                new String[]{"lemonade", "limeade", "Yoo-Hoo", "root beer", "grapeade ", "water", "Mr. Pibb"})));
    }

    static String[] findWord(String x, String[] y) {
        String[] result = Arrays.stream(y)
                .filter(word -> word.toLowerCase().contains(x.toLowerCase()))
                .toArray(String[]::new);
        return result.length == 0 ? new String[]{"Empty"} : result;
    }
}
