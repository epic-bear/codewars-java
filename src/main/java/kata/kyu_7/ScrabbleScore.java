package kata.kyu_7;

import java.util.Map;

public class ScrabbleScore {

    public static void main(String[] args) {
        System.out.println(scrabbleScore("street"));
    }

    public static int scrabbleScore(String word) {
        Map<Integer, String> letterValues = Map.of(1, "AEIOULNRST", 2, "DG", 3, "BCMP", 4, "FHVWY", 5, "K", 8, "JX", 10,
                "QZ");

        int count = 0;

        for (int i = 0; i < word.length(); i++) {
            for (Map.Entry<Integer, String> entry : letterValues.entrySet()) {
                if (entry.getValue().contains(String.valueOf(word.charAt(i)).toUpperCase())) {
                    count += entry.getKey();
                }
            }
        }

        return count;
    }
}
