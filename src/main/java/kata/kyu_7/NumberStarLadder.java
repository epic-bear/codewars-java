package kata.kyu_7;

public class NumberStarLadder {

    public static void main(String[] args) {
        System.out.println(pattern(3));
    }

    public static String pattern(int n) {
        String result = "1";
        for (int i = 1; i < n; i++) {
            result += "\n" + 1 + "*".repeat(i) + (i + 1);
        }
        return result;
    }
}
