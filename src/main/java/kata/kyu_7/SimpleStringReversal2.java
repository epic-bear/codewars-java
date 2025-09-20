package kata.kyu_7;

public class SimpleStringReversal2 {

    public static void main(String[] args) {
        System.out.println(solve("codewars", 1, 5));
    }

    public static String solve(String s, int a, int b) {
        return s.substring(0, a) + (b < s.length() ?
                new StringBuilder(s.substring(a, b + 1)).reverse() + s.substring(b + 1) : new StringBuilder(
                s.substring(a)).reverse());
    }
}
