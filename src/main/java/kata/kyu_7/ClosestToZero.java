package kata.kyu_7;

import java.util.Arrays;
import java.util.Comparator;

public class ClosestToZero {

    public static void main(String[] args) {
        System.out.println(find(new int[]{10, 3, 9, 1}));
    }

    public static Integer find(int[] arr) {
        int lower = Arrays.stream(arr).filter(x -> x < 0).boxed().max(Comparator.naturalOrder()).orElse(Integer.MAX_VALUE);
        int higher = Arrays.stream(arr).filter(x -> x >= 0).boxed().min(Comparator.naturalOrder()).orElse(Integer.MAX_VALUE);
        return higher == Math.abs(lower) ? null : higher < Math.abs(lower) ? higher : lower;
    }
}
