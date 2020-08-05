package kata.kyu_7;

public class NthPowerRulesThemAll {
    public static int modifiedSum(int[] array, int power) {
        int a = 0;
        int b = 0;
        for (int x : array) {
            a += Math.pow(x, power);
            b += x;
        }
        return a - b;
    }
}
