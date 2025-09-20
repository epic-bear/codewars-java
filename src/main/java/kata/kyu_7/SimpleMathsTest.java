package kata.kyu_7;

import java.util.Arrays;

public class SimpleMathsTest {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(numberProperty(7)));
    }

    public static boolean[] numberProperty(int n) {
        boolean[] result = new boolean[3];
        result[0] = n > 1;
        for (int i = 2; i <= Math.sqrt(n); i++)
            if (n % i == 0) {
                result[0] = false;
                break;
            }
        result[1] = n % 2 == 0;
        result[2] = n % 10 == 0;
        return result;
    }
}
