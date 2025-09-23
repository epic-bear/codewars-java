package kata.kyu_7;

public class StackedBall3DTriangleBase {

  public static void main(String[] args) {
    System.out.println(stackHeight3d(2));
  }

  public static double stackHeight3d(int layers) {
    return layers <= 1 ? layers : 1 + Math.sqrt(6) / 3 * (layers - 1);
  }
}
