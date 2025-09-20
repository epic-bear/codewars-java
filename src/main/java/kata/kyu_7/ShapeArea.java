package kata.kyu_7;

public class ShapeArea {

    public static void main(String[] args) {
        System.out.println(shapeArea(2));
    }

    public static int shapeArea(int n) {
        return (int) (Math.pow(n, 2) + Math.pow(n - 1, 2));
    }
}
