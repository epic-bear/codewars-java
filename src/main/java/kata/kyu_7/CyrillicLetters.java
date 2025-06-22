package kata.kyu_7;

public class CyrillicLetters {
    public static void main(String[] args) {
        System.out.println(isCyrillic('Д'));
    }

    public static boolean isCyrillic(char letter) {
        return String.valueOf(letter).matches("[\\u0400-\\u04FF]+");
    }
}
