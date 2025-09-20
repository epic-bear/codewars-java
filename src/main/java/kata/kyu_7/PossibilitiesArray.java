package kata.kyu_7;

import java.util.Arrays;

public class PossibilitiesArray {

    public static void main(String[] args) {
        System.out.println(isAllPossibilities(new int[] {}));
    }

    public static boolean isAllPossibilities(int[] arg) {
        Arrays.sort(arg);

        for (int i = 0; i < arg.length; i++) {
            if (arg[i] != i) {
                return false;
            }
        }
        return arg.length > 0;
    }
}
