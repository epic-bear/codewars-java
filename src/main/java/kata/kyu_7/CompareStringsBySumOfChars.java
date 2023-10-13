package kata.kyu_7;

public class CompareStringsBySumOfChars {

    public static void main(String[] args) {
        System.out.println(compare("ZzZz", "ffPFF"));
    }

    public static boolean compare(String s1, String s2) {
        return counter(s1) == counter(s2);
    }

    private static int counter(String s) {
        if (s == null || s.isEmpty() || s.matches(".*[^a-zA-Z].*")) {
            return 0;
        }
        return s.toUpperCase().chars().sum();
    }
}
