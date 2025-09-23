package kata.kyu_7;

import java.util.Arrays;

public class NDimensionalVectorMagnitude {

  public static void main(String[] args) {
    System.out.println(magnitude(new double[]{0d, 0d}));
  }

  public static double magnitude(double[] vector) {
    return Math.sqrt(Arrays.stream(vector).map(x -> Math.pow(x, 2)).sum());
  }
}
