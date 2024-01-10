package kata.kyu_7;

import java.util.Arrays;

public class SortByBinaryOnes {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(sort(new Integer[]{1,15,5,7,3})));
    }

    public static Integer[] sort(Integer[] list) {
        return Arrays.stream(list)
                .sorted()
                .map(Integer::toBinaryString)
                .sorted((x, y) -> y.replaceAll("0", "").length() - x.replaceAll("0", "").length())
                .map(x -> Integer.parseInt(x, 2))
                .toArray(Integer[]::new);
    }
}
