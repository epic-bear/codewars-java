package kata.kyu_7;

import java.util.Arrays;

public class LuckyNumber {

    public static void main(String[] args) {
        System.out.println(isLucky(0));
    }

    public static boolean isLucky(long n) {
        int count = Arrays.stream(String.valueOf(n).split("")).mapToInt(Integer::valueOf).sum();
        return count % 9 == 0;
    }
}
