package kata.kyu_7;

public class ValidString {

    public static void main(String[] args) {
        System.out.println(validSpacing("Hello world"));
    }

    public static boolean validSpacing(String s) {
        return !s.contains("  ") && s.trim().length() == s.length();
    }
}
