package kata.kyu_7;

import java.util.Arrays;

public class SendInTheClones {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(clonewars(1)));
    }

    public static long[] clonewars(int kataPerDay) {
        long[] result = new long[]{1, 0};
        if (kataPerDay == 0) {
            return result;
        }
        while (kataPerDay > 0) {
            result[1] += kataPerDay * result[0];
            --kataPerDay;
            result[0] *= 2;
        }
        result[0] /= 2;
        return result;
    }
}
