package kata.kyu_7;

import java.util.Arrays;

public class NiceArray {

    public static void main(String[] args) {
        System.out.println(isNice(new Integer[]{2, 5, 4, 3, 2}));
    }

    public static boolean isNice(Integer[] arr) {
     return Arrays.stream(arr)
             .filter(x -> Arrays.asList(arr).contains(x+1) || Arrays.asList(arr).contains(x - 1))
             .count() == arr.length && arr.length > 1;
    }
}
