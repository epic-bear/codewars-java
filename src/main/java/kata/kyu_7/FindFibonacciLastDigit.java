package kata.kyu_7;

public class FindFibonacciLastDigit {

    public static void main(String[] args) {
        System.out.println(getFibNumb(20001));
    }

    public static int getFibNumb(int n) {
        if (n < 2) {
            return 1;
        }
        int first = 1;
        int second = 1;
        for (int i = 2; i < n; i++) {
            int current = (first + second) % 10;
            second = first;
            first = current;
        }
        return first;
    }
}
