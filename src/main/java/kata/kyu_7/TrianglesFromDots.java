package kata.kyu_7;

public class TrianglesFromDots {
    public static void main(String[] args) {
        System.out.println(hoursToSeconds(1000000));
    }



    public static long hoursToSeconds(final int hours) {
        final long ret = hours * 60 * 60;
        return ret;
    }
}
