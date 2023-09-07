package kata.kyu_7;

public class AreaOfACircle {

  public static void main(String[] args) {
    System.out.println(area(1));
  }

  public static double area(double radius) {
    if (radius <= 0) {
      throw new IllegalArgumentException();
    }
    return Math.PI * Math.pow(radius, 2);
  }
}
