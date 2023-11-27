package kata.kyu_7;

public class LaxativeShotRoulette {

    public static void main(String[] args) {
        System.out.println(getChance(4,   1,  3));
    }

    public static double getChance(int n, int x, int a) {
       double res = 1;
       while (a-- > 0) {
         res = res * (n - x) / n--;
       }

       return Math.round(100 * res) / 100.;
    }
}
