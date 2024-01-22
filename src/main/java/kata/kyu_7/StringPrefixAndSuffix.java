package kata.kyu_7;

public class StringPrefixAndSuffix {

    public static void main(String[] args) {
        System.out.println(solve("aaaa"));
    }

    public static int solve(String s) {
        int length = 0;
        for (int i = 0; i < s.length() / 2; i++) {
            if (s.substring(0, i + 1).equals(s.substring(s.length() - 1 - i)) && i < s.length() - 1 - i) {
                length = s.substring(0, i + 1).length();
            }
        }

        return length;
    }
}
