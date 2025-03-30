package kata.kyu_7;

public class StackedBalls3DSquareBase {

    public static void main(String[] args) {
        System.out.println(stackHeight3d(2));
    }

    public static double stackHeight3d(int l) {
        return l > 0 ? 1.0 / Math.sqrt(2) * (l - 1) + 1 : 0;
    }
}
