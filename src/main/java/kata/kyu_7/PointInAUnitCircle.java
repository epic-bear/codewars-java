package kata.kyu_7;


public class PointInAUnitCircle {

    public static void main(String[] args) {
        System.out.println(pointInCircle(0, 0));
    }

    public static boolean pointInCircle(double x, double y) {
        return Math.pow(x, 2) + Math.pow(y, 2) < 1;
    }
}
