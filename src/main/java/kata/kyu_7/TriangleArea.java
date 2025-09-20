package kata.kyu_7;

public class TriangleArea {

    public static void main(String[] args) {
        System.out.println(tArea("\n.\n. .\n. . .\n. . . .\n. . . . .\n"));
    }

    public static float tArea(String tStr) {
        return (float) (Math.pow(tStr.split("\n").length - 2, 2) / 2);
    }
}
