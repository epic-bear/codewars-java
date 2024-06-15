package kata.kyu_7;

import java.util.Arrays;

public class TwoDVectorMapping {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(mapVector(new double[]{46, 58},
                new double[]{0, 0, 100},
                new double[]{0, 0, 100})));
    }

    public  static double[] mapVector(double[] vector, double[] circle1, double[] circle2) {
        double ratio = circle2[2] / circle1[2];
        return new double[]{
                circle2[0] - (circle1[0] - vector[0]) * ratio,
                circle2[1] - (circle1[1] - vector[1]) * ratio
        };
    }
}
