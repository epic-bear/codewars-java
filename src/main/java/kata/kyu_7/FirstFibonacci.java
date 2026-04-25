package kata.kyu_7;

import java.util.Arrays;

public class FirstFibonacci {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(1186, 1919)));
    }

    public static int[] solution(int first, int second) {
        while (first * 2 >= second) {
            int diff = second - first;
            second = first;
            first = diff;
        }
        return new int[]{first, second};
    }
}
