package kata.kyu_7;

import java.util.Arrays;

public class CountTheCombinations {
    public static void main(String[] args) {
        System.out.println(numCombo(new int[]{2, 0, 0, 0, 1}, 1));
    }

    public static int numCombo(int[] xs, int n) {
        int sum = Arrays.stream(xs).sum();
        return (int) Arrays.stream(xs).filter(num -> sum - num == n).count();
    }
}
