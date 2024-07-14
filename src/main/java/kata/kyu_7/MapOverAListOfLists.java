package kata.kyu_7;

import java.util.Arrays;
import java.util.function.Function;

public class MapOverAListOfLists {

    public static void main(String[] args) {
        System.out.println(
                Arrays.deepToString(gridMap(e -> e + 1, new Integer[][]{{2, 3, 4, 5}, {6, 7, 8, 9, 10}, {1, 3, 5}})));
    }

    public static <T, R> Object[] gridMap(Function<T, R> fn, T[][] list) {
        return Arrays.stream(list).map(x -> Arrays.stream(x).map(fn).toArray()).toArray();
    }
}
