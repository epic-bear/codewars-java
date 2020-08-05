package kata.kyu_7;

public class GrowthOfAPopulation {
    public static int nbYear(int p0, double percent, int aug, int p) {
        int years = 0;
        while (p0 < p) {
            p0 = (int) (p0 + p0 * percent * 0.01 + aug);
            years++;
        }
        return years;
    }
}
