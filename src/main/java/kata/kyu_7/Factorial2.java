package kata.kyu_7;

public class Factorial2 {

    public static void main(String[] args) {
        System.out.println(factorial(3));
    }

    public static int factorial(int n) throws IllegalArgumentException {
        if (n < 0 || n > 12) {
            throw new IllegalArgumentException();
        }
        return n > 1 ? n * factorial(n - 1) : 1;
    }
}
