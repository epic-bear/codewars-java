package kata.kyu_7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AnEnglishTwistOnAJapaneseClassic {

    public static void main(String[] args) {
        System.out.println(theGame(new ArrayList<>(
                Arrays.asList("dog", "goose", "elephant", "tiger", "rhino", "orc", "cat"))));
    }

    public static List<String> theGame(List<String> words) {
        List<String> result = new ArrayList<>();
        if (!words.isEmpty() && !words.get(0).isEmpty()) {
            result.add(words.get(0));
            for (int i = 0; i + 1 < words.size(); i++) {
                String currentWord = words.get(i);
                String nextWord = words.get(i + 1);
                if (!nextWord.isEmpty() && currentWord.charAt(currentWord.length() - 1) == nextWord.charAt(0)) {
                    result.add(nextWord);
                } else {
                    break;
                }
            }
        }
        return result;
    }
}
