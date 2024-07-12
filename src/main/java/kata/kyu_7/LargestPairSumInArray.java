package kata.kyu_7;

import java.util.Arrays;

public class LargestPairSumInArray {

    public static void main(String[] args) {
        System.out.println(largestPairSum(new int[]{10,14,2,23,19}));
    }

    public static int largestPairSum(int[] numbers){
        Arrays.sort(numbers);
        return numbers[numbers.length - 1] + numbers[numbers.length - 2];
    }
}
