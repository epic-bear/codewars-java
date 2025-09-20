package kata.kyu_7;

import java.util.Arrays;

public class WordValues {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(nameValue(new String[]{"abc", "abc abc"})));
    }

    public static int[] nameValue(String[] arr) {
        int[] result = new int[arr.length];

        for (int i = 0; i < arr.length; ) {
            arr[i] = arr[i].replaceAll(" ", "");
            for (int j = 0; j < arr[i].length(); j++) {
                result[i] += arr[i].charAt(j) - 96;
            }
            result[i] *= ++i;
        }

        return result;
    }
}
