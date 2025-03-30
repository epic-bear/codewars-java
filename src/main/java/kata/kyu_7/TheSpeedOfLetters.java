package kata.kyu_7;


import java.util.ArrayList;
import java.util.List;

public class TheSpeedOfLetters {

    public static void main(String[] args) {
        System.out.println(speedify("ACE"));
    }

    public static String speedify(final String input) {
        List<String> result = new ArrayList<>();
        for (int i = 0; i < input.length(); i++) {
            int shiftedLetterPosition = i + input.charAt(i) - 65;
            for (int j = i; j < shiftedLetterPosition; j++) {
                if (j < result.size()){
                    continue;
                }
                result.add(j," ");
            }
            if (shiftedLetterPosition < result.size()) {
                result.remove(shiftedLetterPosition);
            }
            result.add(shiftedLetterPosition, String.valueOf(input.charAt(i)));
        }
        return String.join("", result);
    }
}
