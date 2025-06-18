package kata.kyu_7;

public class DifferenceOfSquares {
    public static void main(String[] args) {
        System.out.println(differenceOfSquares(10));
    }

    public static int differenceOfSquares(int n){
        int a = 0;
        int b = 0;
        for (int i = 1; i <= n; i++) {
            a += i;
            b += (int) Math.pow(i, 2);
        }
        return (int) (Math.pow(a, 2) - b);
    }
}
