package kata.kyu_7;

public class SuitcasePacking {

    public static void main(String[] args) {
        System.out.println(fit_in(6,5,8,7));
    }

    public static Boolean fit_in(int a, int b, int m, int n) {
        return a + b <= Math.max(m, n) && Math.max(a, b) <= Math.min(m, n);
    }
}
