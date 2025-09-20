package kata.kyu_7;

public class CalculateTheHarmonicConjugatedPointOfATripletOfAllPoints {

    public static void main(String[] args) {
        System.out.println(harmPoints(6, 10, 11));
    }

    public static double harmPoints(double a, double b, double c) {
        double AC = c - a;
        double BC = c - b;
        double AB = b - a;
        double DB = AB / (AC / BC + 1);
        return Math.round((b - DB) * 10000) / 10000.0;
    }
}
