package kata.kyu_7;

import java.util.Arrays;

public class RemoveTheMinimum {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(removeSmallest(new int[]{2, 2, 1, 2, 1})));
    }

    public static int[] removeSmallest(int[] numbers) {
        if (numbers.length == 0) {
            return new int[0];
        }
        int min = Arrays.stream(numbers).min().orElse(0);
        int counter = 0;
        int[] result = new int[numbers.length - 1];
        for (int i = 0; i < numbers.length; i++) {
            if (counter == 0 && numbers[i] == min) {
                counter++;
            } else {
                result[i - counter] = numbers[i];
            }
        }
        return result;
    }
}
