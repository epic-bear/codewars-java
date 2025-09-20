package kata.kyu_7;

import java.util.Arrays;

public class LostNumberInNumberSequence {

    public static void main(String[] args) {
        System.out.println(findDeletedNumber(new int[]{1, 2, 3, 4, 5}, new int[]{3, 4, 1, 5}));
    }

    public static int findDeletedNumber(int[] arr, int[] mixedArr) {
        return Arrays.stream(arr).sum() - Arrays.stream(mixedArr).sum();
    }
}
