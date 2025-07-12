package kata.kyu_7;

import java.util.stream.IntStream;

public class EvensTimesLast {
    public static void main(String[] args) {
        System.out.println(evenLast(new int[]{2, 3, 4, 5}));
    }

    public static int evenLast(int[] numbers) {
        return numbers.length == 0 ? 0 : IntStream.range(0, numbers.length)
                .filter(number -> number % 2 == 0)
                .map(n -> numbers[n]).sum() * numbers[numbers.length - 1];
    }
}
