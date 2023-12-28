package kata.kyu_7;

import java.util.Arrays;
import java.util.stream.IntStream;

public class ArraySquareUp {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(squareUp(2)));
    }

    public static int[] squareUp(int n) {
        return IntStream.range(0,n)
                .flatMap( x -> IntStream.range(0,n).map( y -> y >= n-1-x ? n-y : 0 ))
                .toArray();
    }
}
