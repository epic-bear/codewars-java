package kata.kyu_7;

public class SpeedControl {

  public static void main(String[] args) {
    System.out.println(gps(20, new double[]{0.0, 0.23, 0.46, 0.69, 0.92, 1.15, 1.38, 1.61}));
  }

  public static int gps(int s, double[] x) {
    if (x.length <= 1) {
      return 0;
    }

    int maxAvgSpeed = 0;
    for (int i = 0; i < x.length - 1; i++) {
      int avgSpeed = (int) Math.floor((3600 * Math.abs(x[i] - x[i + 1])) / s);
      if (avgSpeed > maxAvgSpeed) {
        maxAvgSpeed = avgSpeed;
      }
    }
    return maxAvgSpeed;
  }
}
