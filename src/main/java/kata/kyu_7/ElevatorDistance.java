package kata.kyu_7;

import java.util.stream.IntStream;

public class ElevatorDistance {
    public static void main(String[] args) {
        System.out.println(elevatorDistance(new int[]{5, 2, 8}));
    }

    public static int elevatorDistance(int[] a) {
        return IntStream.range(0, a.length - 1).map(x -> Math.abs(a[x] - a[x + 1])).sum();
    }
}
