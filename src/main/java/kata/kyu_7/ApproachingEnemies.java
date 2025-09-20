package kata.kyu_7;

public class ApproachingEnemies {

    public static void main(String[] args) {
        System.out.println(calculateTime(new double[]{-90, 0}, new double[]{-80, 0}));
    }

    public static double calculateTime(double[] p1, double[] p2) {
        double xTime = Math.abs(p1[0] - p2[0]) == 0 ? 0 : Math.abs(p2[0] / (p1[0] - p2[0]));
        double yTime = Math.abs(p1[1] - p2[1]) == 0 ? 0 : Math.abs(p2[1] / (p1[1] - p2[1]));
        return Math.max(xTime , yTime) * 5;
    }
}
