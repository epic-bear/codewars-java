package kata.kyu_7;

public class SimpleLetterRemoval {

    public static void main(String[] args) {
        System.out.println(solve("iiiiiii", 6));
    }

    public static String solve(String s, int k) {
        for (var c : "abcdefghijklmnopqrstuvwxyz".split("")) {
            while (!s.isEmpty() && s.contains(c) && k-- > 0) {
                s = s.replaceFirst(c, "");
            }
        }
        return s;
    }
}
