package kata.kyu_8;

import java.util.Arrays;

public class RemoveDuplicatesFromList {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(distinct(new int[]{1, 1, 2, 3})));
    }

    public static int[] distinct(int[] array){
        return Arrays.stream(array).distinct().toArray();
    }
}
