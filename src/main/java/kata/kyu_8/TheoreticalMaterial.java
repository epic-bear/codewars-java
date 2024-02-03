package kata.kyu_8;

public class TheoreticalMaterial {

    public static void main(String[] args) {
        System.out.println(collinearity(1, 1, 1, 1));
    }

    public static boolean collinearity(int x1, int y1, int x2, int y2) {
      return x1 * y2 == x2 * y1;
    }
}
