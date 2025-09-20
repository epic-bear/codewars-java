package kata.kyu_7;

import java.util.Arrays;
import java.util.stream.IntStream;

public class DoubleEveryOther {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(doubleEveryOther(new int[]{1, 2, 3, 4})));
    }

    public static int[] doubleEveryOther(int[] a){
        IntStream.range(0, a.length).filter(x -> x % 2 != 0).forEach(i -> a[i] *= 2);
        return a;
    }
}
