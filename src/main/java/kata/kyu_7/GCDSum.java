package kata.kyu_7;

import java.util.Arrays;

public class GCDSum {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solve(6, 3)));
    }

    public static int[] solve(int s, int g){
        int[] result = new int[] {-1, -1};
        if (s % g == 0) {
         result[0] = g;
         result[1] = s - g;
        }
        return result;
    }
}
