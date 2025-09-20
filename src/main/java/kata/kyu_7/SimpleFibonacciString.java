package kata.kyu_7;

public class SimpleFibonacciString {

    public static void main(String[] args) {
        System.out.println(solve(1));
    }

    public static String solve(int n) {
        String x = "0";
        String y = "01";
        String result = n == 0 ? x : y;
        while (n > 1) {
            result = y + x;
            x = y;
            y = result;
            n--;
        }
        return result;
    }
}
