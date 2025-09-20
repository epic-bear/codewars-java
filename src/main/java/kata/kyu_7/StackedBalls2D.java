package kata.kyu_7;

public class StackedBalls2D {

    public static void main(String[] args) {
        System.out.println(3);
    }

    public static double stackHeight2d(int layers) {
        return layers > 0 ? 1 + (layers-1)*Math.sin(Math.PI/3) : 0;
    }
}
