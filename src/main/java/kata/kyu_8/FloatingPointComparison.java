package kata.kyu_8;


public class FloatingPointComparison {

    public static void main(String[] args) {
        System.out.println(approxEquals(1456.3652, 1456.3641000));
    }

    public static boolean approxEquals(double a, double b) {
        return Math.abs(a - b) <= 0.001;
    }
}
