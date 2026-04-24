package kata.kyu_7;

public class SpanishDNIValidationAlgorithm {
    private static final char[] LETTER_MAP = {
            'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F',
            'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S',
            'Q', 'V', 'H', 'L', 'C', 'K', 'E'
    };

    public static void main(String[] args) {
        System.out.println(isValid("12345678Z"));
    }

    public static boolean isValid(String document) {
        return document.matches("\\d{8}[A-Z]") &&
                document.charAt(8) == LETTER_MAP[Integer.parseInt(document.substring(0, 8)) % 23];
    }
}
