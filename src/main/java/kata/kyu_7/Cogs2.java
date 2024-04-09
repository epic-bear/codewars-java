package kata.kyu_7;

import java.util.Arrays;

public class Cogs2 {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(cogRpm(new int[]{100, 50, 25}, 1)));
    }

    public static double[] cogRpm(final int[] cogs, final int n) {
        double[] result = new double[]{0, 0};
        result[0] = n % 2 != 0 ? (double) cogs[n] / cogs[0] * -1 : (double) cogs[n] / cogs[0];
        result[1] = (n + cogs.length - 1) % 2 == 0 ?
                (double) cogs[n] / cogs[cogs.length - 1] : (double) cogs[n] * -1 / cogs[cogs.length - 1];

        return result;
    }
}
