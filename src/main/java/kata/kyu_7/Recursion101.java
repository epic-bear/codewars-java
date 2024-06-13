package kata.kyu_7;

import java.util.Arrays;

public class Recursion101 {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solve(6, 19)));
    }

    public static int[] solve(int a, int b) {
        if (a == 0 || b == 0) {
            return new int[]{a, b};
        } else if (a >= 2 * b) {
            return solve(a - 2 * b, b);
        } else if (b >= a * 2) {
            return solve(a, b - 2 * a);
        } else {
            return new int[]{a, b};
        }
    }
}
