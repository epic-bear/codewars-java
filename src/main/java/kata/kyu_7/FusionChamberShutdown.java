package kata.kyu_7;

import java.util.Arrays;

public class FusionChamberShutdown {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(burner(45, 11, 100)));
    }

    public static int[] burner(int c, int h, int o) {
        int water = Math.min(h / 2, o);
        h -= water * 2;
        o -= water;

        int carbonDioxide = Math.min(c, o / 2);
        c -= carbonDioxide;

        int methane = Math.min(c, h / 4);

        return new int[]{water, carbonDioxide, methane};
    }
}
