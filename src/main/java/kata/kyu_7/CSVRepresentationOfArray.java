package kata.kyu_7;

import java.util.Arrays;
import java.util.stream.Collectors;

public class CSVRepresentationOfArray {

    public static void main(String[] args) {
        System.out.println(toCsvText(new int[][]{
                new int[]{0, 1, 2, 3, 45}
                , new int[]{10, 11, 12, 13, 14}
                , new int[]{20, 21, 22, 23, 24}
                , new int[]{30, 31, 32, 33, 34}}));
    }

    public static String toCsvText(int[][] array) {
        return Arrays.stream(array)
                .map(x -> Arrays.stream(x).mapToObj(String::valueOf).collect(Collectors.joining(",")))
                .collect(Collectors.joining("\n"));
    }
}
