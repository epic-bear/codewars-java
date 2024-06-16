package kata.kyu_7;

import java.util.List;

public class HungarianVowelHarmonyEasy {

    public static void main(String[] args) {
        System.out.println(dative("ablak"));
    }

    public static String dative(String word) {
        for (int i = word.length() - 1; i >= 0; i--) {
            if (List.of('e', 'é', 'i', 'í', 'ö', 'ő', 'ü', 'ű').contains(word.charAt(i)))return word + "nek";
            if (List.of('a', 'á', 'o', 'ó', 'u', 'ú').contains(word.charAt(i)))return word + "nak";
        }
        return word;
    }

}
