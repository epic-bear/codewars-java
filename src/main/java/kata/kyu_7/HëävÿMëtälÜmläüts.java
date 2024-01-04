package kata.kyu_7;

import java.util.Map;

public class HëävÿMëtälÜmläüts {

    public static void main(String[] args) {
        System.out.println(heavyMetalUmlauts("Announcing the Macbook Air Guitar"));
    }

    public static String heavyMetalUmlauts(String boringText) {
        Map<String, String> letters = Map.of("A", "Ä", "O", "Ö", "E", "Ë", "U", "Ü", "I", "Ï", "Y", "Ÿ");
        String[] textArray = boringText.split("");

        for (int i = 0; i < textArray.length; i++) {
            if (letters.containsKey(textArray[i].toUpperCase())) {
                textArray[i] = Character.isUpperCase(textArray[i].charAt(0)) ? letters.get(textArray[i]) : letters.get(
                        textArray[i].toUpperCase()).toLowerCase();
            }
        }

        return String.join("", textArray);
    }
}
