package kata.kyu_7;

import java.util.*;

public class LostLineup {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(findLineup(new int[]{1, 2, 0})));
    }

    public static int[] findLineup(final int[] distances) {
        if (distances == null || (distances.length == 1 && distances[0] != 0)) {
            return new int[]{};
        }
        int[] result = new int[distances.length];
        for (int i = 0; i < distances.length; i++) {
            if (distances[i] >= result.length || result[distances[i]] != 0) {
                return new int[]{};
            } else {
                result[distances[i]] = i + 1;
            }
        }
        return result;
    }
}
