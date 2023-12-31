package kata.kyu_7;

public class CompleteThePattern2 {

    public static void main(String[] args) {
        System.out.println(pattern(44));
    }

    public static String pattern(int n) {
        if (n < 1) {
            return "";
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            for (int j = n; j >= i; j--) {
                sb.append(j);
            }
            if (i < n)
                sb.append('\n');
        }
        return sb.toString();
    }
}
