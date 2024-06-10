package kata.kyu_7;

import java.util.Arrays;
import java.util.stream.Stream;

public class DoubleSort {

    public static void main(String[] args) {
        System.out.println(
                Arrays.toString(dbSort(new Object[]{"Apple", 46, "287", 574, "Peach", "3", "69", 78, "Grape", "423"})));
    }

    public static Object[] dbSort(Object[] a){
       return Stream.concat(Arrays.stream(a).filter(x -> x instanceof Number).map(x -> (Number)x).sorted(),
               Arrays.stream(a).filter(x -> x instanceof String).map(x -> (String)x).sorted()).toArray();
    }
}
