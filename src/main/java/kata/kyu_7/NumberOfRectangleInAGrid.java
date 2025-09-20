package kata.kyu_7;

public class NumberOfRectangleInAGrid {

    public static void main(String[] args) {
        System.out.println(numberOfRectangles(4, 4));
    }

    public static int numberOfRectangles(int m, int n) {
       return m * (m + 1) * n * (n + 1) / 4;
    }
}
